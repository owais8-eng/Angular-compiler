parser grammar AngParser;

options { tokenVocab=AngLexer; }

app : (importR | variable | function | exports | enum | interfaceCode)*  ;

importR: IMPORT OPEN_BRACE (((ID) COMMA?)* SIGNAL? COMMA? ((ID) COMMA?)*) CLOSE_BRACE FROM SingleLineString SIME;

exports : decorater* EXPORT CLASS ID ((IMPLEMENT | EXTEND) ID)?  classBody ;

classBody: OPEN_BRACE (constructor | variable | function | interfaceCode)* CLOSE_BRACE ;

decorater
  : AT COMPONENT OPEN_PAREN componentConfig CLOSE_PAREN       #componentDecorator
  | AT DIRECTIVE OPEN_PAREN directiveConfig CLOSE_PAREN       #directiveDecorator
  | AT INJECTABLE OPEN_PAREN injectableConfig CLOSE_PAREN     #injectableDecorator
  ;

componentConfig: OPEN_BRACE selector COMMA (templateUrl | template) (COMMA styleUrls)? CLOSE_BRACE ;

directiveConfig: OPEN_BRACE selector CLOSE_BRACE ;

injectableConfig: OPEN_BRACE PROVIDEDIN COLON (PROVIDED_IN_ROOT | PROVIDED_IN_PLATFORM | PROVIDED_IN_ANY | SingleLineString) CLOSE_BRACE ;

selector: SELECTOR COLON SingleLineString ;

templateUrl: TEMPLATEURL COLON SingleLineString ;

template: TEMPLATE COLON  html ;

styleUrls: STYLES COLON array ;

map: OPEN_BRACE (((ID) COLON value) COMMA?)* CLOSE_BRACE ;
//edited
value
  : subValue                        #subValueValue
  | array                           #arrayValue
  | B_C html B_C                    #htmlValue
  | ID (DOT ID)*                    #stateValue
  ;

array: OPEN_SQUARE (subValue COMMA?)* CLOSE_SQUARE ;
//EDIED
subValue
  : SingleLineString             #stringSubValue
  | ID                           #idSubValue
  | NUMBER                      #numberSubValue
  | B_C cssCode+ B_C             #cssBlockSubValue
  | (ID | STATE) (DOT ID)+                 #dotAccessSubValue
  ;

//edited
variable: (LET | VAR | CONST | STATE)? (PRIVATE | PUBLIC)? (ID | variableName ) (COLON (DATATYPE_ | vv | OPEN_SQUARE (dd COMMA?)* CLOSE_SQUARE) (OPEN_SQUARE CLOSE_SQUARE)?)? EQUAL variableValue SIME;

variableName
 :   (DOT ID)*
 ;
//added
updateState
 : ID (DOT ID)* EQUAL (subValue | array | map) SIME
 ;

variableValue
  : NEW? SingleLineString (OPEN_PAREN vv* CLOSE_PAREN)?         #stringVarValue
  | NEW? DECIMEL (OPEN_PAREN vv* CLOSE_PAREN)?                  #numberVarValue
  | NEW? ID (OPEN_PAREN vv* CLOSE_PAREN)?                       #idVarValue
  | NEW? array (OPEN_PAREN vv* CLOSE_PAREN)?                    #arrayVarValue
  | NEW? map (OPEN_PAREN vv* CLOSE_PAREN)?                      #mapVarValue
  | thisCall (OPEN_PAREN vv* CLOSE_PAREN)?                      #thisCallVarValue
  | function2 (OPEN_PAREN vv* CLOSE_PAREN)?                     #func2VarValue
  | NEW? callFun (OPEN_PAREN vv* CLOSE_PAREN)?                  #callFunVarValue
  | function (OPEN_PAREN vv* CLOSE_PAREN)?                      #funcVarValue
  ;

constructor : CONSTRUCTOR OPEN_PAREN ((PRIVATE | PUBLIC)? vv (COLON (DATATYPE_ | ID))? COMMA?)* CLOSE_PAREN OPEN_BRACE functionBody CLOSE_BRACE;

vv: ID ;

function: FUNCTION? ID? OPEN_PAREN functionParams* CLOSE_PAREN (COLON (DATATYPE_ | vv | OPEN_SQUARE (dd COMMA?)* CLOSE_SQUARE) (OPEN_SQUARE CLOSE_SQUARE)?)? OPEN_BRACE functionBody returnStatement? CLOSE_BRACE;

function2: OPEN_PAREN functionParams* CLOSE_PAREN (COLON (DATATYPE_ | vv | OPEN_SQUARE (dd COMMA?)* CLOSE_SQUARE) (OPEN_SQUARE CLOSE_SQUARE)?)? ARROW OPEN_BRACE? functionBody returnStatement? CLOSE_BRACE?;

dd : DATATYPE_ ;

functionParams: vv (COLON (DATATYPE_ | ID))? COMMA?;

//edited
functionBody :
    (statement | updateState)* ;

statement
    : variable      #variableStatement
    | thisCall      #thisCallStatement
    | print         #printStatement
    | callFun       #callFunStatement
    ;

thisCall: (THIS | ID) (DOT ID DOT?)* (variableValue | dotdot* | PLPL) SIME?;

dotdot: ((DOT ID)? (OPEN_PAREN ((vv | SingleLineString | function2) COMMA?)* CLOSE_PAREN)) ;

print: CONSOLE_ DOT LOG_ OPEN_PAREN (SingleLineString | thisCall) CLOSE_PAREN SIME ;

returnStatement: RETURN? (thisCall | SingleLineString | DECIMEL | ID | array) SIME?;

// ------------------------------------- Html Rules ---------------------------------------------

html:
      JSX_OPEN (SYNTAX) htmlinside? JSX_SLASH? JSX_CLOSE
      ((htmlBody |html* |  (ID* | htmlDot | htmlVar) )
      (JSX_OPEN JSX_SLASH SYNTAX JSX_CLOSE ))?
      ;

htmlDot :OPEN_BRACE? ID DOT ID CLOSE_BRACE?;

//edited
htmlVar :OPEN_BRACE? ID (DOT ID)* CLOSE_BRACE?;

htmlinside : sy? (htmlID | htmlClass)* ;

htmlID : (MULTI? (ID) EQUAL OPEN_BRACE? value2 CLOSE_BRACE?) ;

htmlClass : ((CLASS) EQUAL OPEN_BRACE? value2 CLOSE_BRACE?) ;

sy : ID ;

value2 :
    onClick #onClickValue
    | attributeValue #attributedValue
    | ID DOT ID #propertyAccessValue
    ;

onClick: OPEN_BRACE (function2) CLOSE_BRACE | OPEN_BRACE (ID) CLOSE_BRACE ;

attributeValue: SingleLineString
              | NUMBER
              | ID;

htmlBody
  : OPEN_BRACE mapMethod2 CLOSE_BRACE    #mapHtmlBody
  | OPEN_BRACE hh CLOSE_BRACE            #ifHtmlBody
  ;

hh : ID AND OPEN_PAREN html CLOSE_PAREN;

mapMethod2 : (ID DOT)* MAP_ OPEN_PAREN OPEN_PAREN mapParam?  CLOSE_PAREN ARROW  OPEN_PAREN html CLOSE_PAREN CLOSE_PAREN ;

mapParam : (ID COMMA?)* ;

//edited
callFun
 : AWAIT? navigateCall    SIME?    #navigateStatement
 | AWAIT? routerCall      SIME?    #routerStatement
 ;

//added
navigateCall
  : NAVIGATE OPEN_PAREN SingleLineString (COMMA stateParam)? CLOSE_PAREN
  ;

//added
routerCall
 : (THIS DOT)? routerName DOT NAVIGATE OPEN_PAREN SingleLineString (COMMA stateParam)? CLOSE_PAREN
 ;

 //added
routerName
 : ID
 | ROUTER
 ;

 //added
stateParam
 : OPEN_BRACE (ID COLON (SingleLineString | DECIMEL | ID | map | array)) (COMMA (ID COLON (SingleLineString | DECIMEL | ID | map | array)))* CLOSE_BRACE
 ;

// --------------------------------------CSS Rules ------------------------------------------------------

cssCode : ((DOT | SQ)? cssKey)* OPEN_BRACE cssInner* CLOSE_BRACE ;

cssKey :  (sy (MINUS sy)+) | ID | WIDTH | SYNTAX;

cssInner :
    cssKey COLON ID SIME? #idCssValue
    | cssKey COLON (NUMBER PX?)+ SIME? #numberCssValue
    | cssKey COLON (NUMBER HUN) SIME? #percentageCssValue
    | cssKey COLON callFun SIME? #functionCssValue
    ;

//---------------------------------------------------------------------------------------------------
enum: ENUM sy OPEN_BRACE (ID COMMA?)* CLOSE_BRACE ;

interfaceCode: INTERFACE sy OPEN_BRACE (ID COLON (DATATYPE_ | vv) SIME)* CLOSE_BRACE ;