# Kanban:
https://github.com/users/MehradMilan/projects/1/views/1

# دستور کار

## گام ۱: افزودن یک روش پیام رسانی دیگر

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>MessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان sendTelegramMessage</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>SmsMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع
void
با بدنه خالی و عنوان
sendTelegramMessage</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>EmailMessageService</p>
</td>
<td width="141">
<p>افزودن تابع ارسال پیام تلگرامی</p>
</td>
<td width="292">
<p>افزودن یک تابع
void
با بدنه خالی و عنوان
sendTelegramMessage</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>
افزودن کلاس جدید
</p>
</td>
<td width="292">
<p>
</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>TelegramMessage</p>
</td>
<td width="141">
<p>
افزودن فیلد
</p>
</td>
<td width="292">
<p>
اضافه کردن دو فیلد
SourceId
و
DestinationId
و getter و setter
برای آن‌ها
</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>
افزودن کلاس جدید
</p>
</td>
<td width="292">
<p>
</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۷</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>
افزودن تابع
</p>
</td>
<td width="292">
<p>
افزودن تابع void با عنوان
sendSmsMessage
با بدنه خالی
</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۸</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>
افزودن تابع
</p>
</td>
<td width="292">
<p>
افزودن تابع void با عنوان
sendEmailMessage
با بدنه خالی
</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۹</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>
افزودن تابع
</p>
</td>
<td width="292">
<p>
افزودن تابع boolean با عنوان
validateTelegramId
جهت چک کردن معتبر بودن id
</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۰</strong></p>
</td>
<td width="198">
<p>TelegramMessageService</p>
</td>
<td width="141">
<p>
افزودن تابع
</p>
</td>
<td width="292">
<p>
افزودن تابع void با عنوان
sendTelegramMessage
جهت ارسال پیام
</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۱</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>
افزودن ورودی گرفتن پیام Telegram
</p>
</td>
<td width="292">
<p>
افزودن یک case با شماره 3 و ورودی گرفتن مبدا و مقصد و متن پیام در آن
</p>
</td>
</tr>
<tr>
<td width="64">
<p><strong>۱۲</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>
افزودن قابلیت ارسال پیام با Telegram
</p>
</td>
<td width="292">
<p>
اضافه کردن یک if به آخر برنامه و ارسال پیام با استفاده از تابع sendTelegramMessage در صورتی که آبجکت message از جنس TelegramMessage باشد.
</p>
</td>
</tr>

</tbody>
</table>

مجموع تعداد تغییرات: ۱۲

## گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>-</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
برای اضافه کردن قابلیت ارسال پیام با تلگرام ناچاریم بقیه‌ی سرویس‌های دیگر ارسال پیام را نیز تغییر دهیم و تابع مربوط به ارسال پیام با تلگرام را با بدنه خالی به آن‌ها اضافه کنیم. همچنین در کلاس Main نباید که سطح بالا است نباید با اضافه کردن TelegramService تغییری ایجاد می‌شد که عدم رعایت این موضوع نشان می‌دهد این اصل نقض شده است.
</p>
</td>
</tr>

<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
تمام سرویس هایی که واسط Message سرویس را پیاده‌سازی می‌کنند، دارای رابطه‌ی is-a با آن هستند.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
شاید کمی سخت‌گیری باشد ولی
اگر پیاده‌سازی درست بود نباید برای هر سرویس یک تابع درون واسط می‌بود.و توابع خالی می‌داشتیم، در نتیجه می‌توان این را مظهری از نقض این اصل دانست.
</p>
</td>
</tr>

<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>-</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
مثالی از نقض آن وابستگی سرویس اس ام اس به داشتن متد ارسال از طریق تلگرام است که از آن استفاده‌ای نمی‌کند.
</p>
</td>
</tr>

<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
از آنجایی که تعریف نوع متغیر Message سرویس از واسط سطح بالا (main) صورت گرفته است، در آن بخش DIP محقق شده است.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
یک مورد که می‌توان به عنوان نقض DIP به آن اشاره کرد، این است که واسطمان نگاه سطح بالا به فرآیند ارسال پیام ندارد و جزئیات (پلتفرم ارسال پیام) وارد آن شده است.
</p>
</td>
</tr>

</tbody>
</table>

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>
Open-Close Principle (OCP)
</p>
</td>
<td width="246">
<p>
برای اضافه کردن قابلیت ارسال پیام با تلگرام ناچاریم بقیه‌ی سرویس‌های دیگر ارسال پیام را نیز تغییر دهیم و تابع مربوط به ارسال پیام با تلگرام را با بادی خالی به آن‌ها اضافه کنیم.
</p>
</td>
<td width="284">
<p>
واسط فقط تابع send داشته باشد و بقیه آن را بسته به نوعشان پیاده‌سازی کنند. همچنین ساخت Message و
MessageService
متناظر با ورودی را به کلاس‌های Factory می‌سپاریم.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>
Liskov Substitution Principle
</p>
</td>
<td width="246">
<p>
اگر پیاده‌سازی درست بود نباید برای هر سرویس یک تابع توی واسط می‌بود. در نتیجه می‌توان این را مظهری از نقض این اصل دانست.
</p>
</td>
<td width="284">
<p>
راه حل ذکر شده برای اصل ۲ این مشکل را مرتفع می‌کند.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>Integration Segregation Principle</p>
</td>
<td width="246">
<p>
مثالی از نقض آن وابستگی سرویس اس ام اس به داشتن متد ارسال از طریق تلگرام است که از آن استفاده‌ای نمی‌کند. بقیه سرویس‌ها هم به طریق مشابه این اصل را نقض می‌کنند.
</p>
</td>
<td width="284">
<p>
راه‌حل ذکر شده برای اصل ۲ این مشکل را مرتفع می‌کند.
</p>
</td>
<tr>
<td width="168">
<p>DIP</p>
</td>
<td width="246">
<p>
یک مورد که می‌توان به عنوان نقض DIP به آن اشاره کرد، این است که واسطمان نگاه سطح بالا به فرآیند ارسال پیام ندارد و جزئیات (پلتفرم ارسال پیام) وارد آن شده است.
</p>
</td>
<td width="284">
<p>
راه‌حل ذکر شده برای اصل ۲ این مشکل را مرتفع می‌کند.
<br>
همچنین می‌توانیم در تابع main از الگوی طراحی
Factory استفاده کنیم و با استفاده از آن سرویس متناسب با ورودی را انتخاب کنیم.
</p>
</td>
</tr>
</tbody>
</table>

## گام ۳: اصلاح موارد نقض
این موارد را در ریپوی پروژه می‌توانید مشاهده کنید.

در اصلاح موارد این بخش فرض ما بر این بود که نباید فایل model ها را تغییر داد وگرنه با کاربرد فعلی می‌شد انواع مدل‌ها برای Message را حذف کرد و تنها به داشتن خود مدل Message بسنده کرد.
چون همه بچه‌های Message یک فیلد source و یک فیلد target داشتند می‌توانستیم با اضافه کردن این دو فیلد به کلاس Message بقیه آن‌ها را خالی کنیم.

## گام ۴: بررسی مجدد تغییرات مورد نیاز

تنها موارد ۴ و ۵ و ۶ و همچنین اضافه کردن پیاده‌سازی تابع
send
درون سرویس
Telegram
باقی می‌مانند. همچنین نیاز است تا درون enumمان
تایپ Telegram
را اضافه کرده و تابع
Factory را بروزرسانی کنیم.
همچنین تلاش کردیم فرآیند دریافت Message
از ورودی را از تابع Main خارج کنیم تا
اگر در آینده قصد داشتیم فیچر دیگری به برنامه اضافه کنیم تغییری نیاز نباشد در کلاس Main
که کلاس سطح بالا است بدهیم.


## گام ۵: جمع بندی

کد را مجددا بازنویسی کردیم و سعی کردیم مشکلات اصول solid را برطرف کنیم.
در پیاده‌سازی جدید به راحتی می‌توان سرویس‌های Messaging مختلف اضافه کرد بدون آنکه نیازی به تغییر در کد سرویس‌های Messaging دیگر باشد و در نتیجه وابستگی کدها کم شود. (اصل ۲)
دیگر سرویس‌های مختلف نیازی به پیاده‌سازی توابع با بدنه‌ی خالی ندارند. (اصل ۴)
دیگر کلاس Messaging سرویس نیازی به پیاده‌سازی تابع برای انواع روش‌های Messaging ندارد (اصل ۳)
در نهایت با تغییر در ساختار کد دیگر نیازی به پیاده‌سازی‌های جداگانه برای هر روش ارسال در ابتدا نداریم (اصل ۵)
در نهایت توانستیم با رعایت اصول فوق کد را تمیزتر و قابلیت توسعه و نگهداری آن را افزایش دهیم.