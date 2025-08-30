            document.addEventListener('DOMContentLoaded', function() {
                       const form = document.getElementById('add-product-form');
                       const imageInput = document.getElementById('product-image');
                       const previewImg = document.getElementById('preview-img');
                       const previewText = document.getElementById('preview-text');
                       const notification = document.getElementById('notification');
                       const cancelBtn = document.getElementById('cancel-btn');

                       imageInput.addEventListener('change', function() {
                           const file = this.files[0];
                           if (file) {
                               const reader = new FileReader();

                               reader.addEventListener('load', function() {
                                   previewImg.src = reader.result;
                                   previewImg.style.display = 'block';
                                   previewText.style.display = 'none';
                               });

                               reader.readAsDataURL(file);
                           } else {
                               previewImg.style.display = 'none';
                               previewText.style.display = 'block';
                           }
                       });

                       form.addEventListener('submit', function(e) {
                           e.preventDefault();

                           showNotification('تم إضافة المنتج بنجاح!');

                           setTimeout(function() {
                               form.reset();
                               previewImg.style.display = 'none';
                               previewText.style.display = 'block';
                           }, 2000);
                       });

                       cancelBtn.addEventListener('click', function() {
                           if (confirm('هل تريد حقاً إلغاء عملية الإضافة؟ سيتم فقدان جميع البيانات.')) {
                               form.reset();
                               previewImg.style.display = 'none';
                               previewText.style.display = 'block';
                           }
                       });

                       function showNotification(message) {
                           notification.textContent = message;
                           notification.classList.add('show');

                           setTimeout(function() {
                               notification.classList.remove('show');
                           }, 3000);
                       }
                   });
