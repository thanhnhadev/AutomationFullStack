1)Install Interlj and plugin tabineStarter 
2)Install google chorome Version 122.0.6261.131 (Official Build) (64-bit) and plugin Selectors HUbs and plugin ChroPath
3)Install appium inspector and Appium Server GUI 
4)Install java version "21.0.1" 2023-10-17 LTS
5)Install Android Studio or Genymotion 
document:
1)https://anhtester.com/blog/selenium-java/tao-project-selenium-java-voi-intellij-ide
2)https://anhtester.com/blog/selenium-java/selenium-java-bai-4-cai-dat-moi-truong-selenium-voi-java
1. Cài đặt JDK vào máy tính
   [Selenium Java] Cài đặt môi trường Java JDK và IDE để code

2. Cài đặt Chrome Browser
   Đầu tiên, chúng ta cài đặt Chrome browser ở trang chủ
   Có khi máy các bạn đã có sẵn ấy chứ. Một lưu ý cực kì quan trọng là sau bước này, các bạn phải tiến hành check version của Chrome để tải chromedriver cho đúng, nếu không sẽ phát sinh lỗi khi run script. Gõ vào chrome://settings/help để tiến hành kiểm tra Chrome version.

[Selenium Java] Bài 4: Cài đặt môi trường Selenium với Java | Anh Tester


3. Download Chrome Driver
   Tiếp theo là tải về Chrome Driver (chromedriver.exe), click vào đây

Hoặc https://googlechromelabs.github.io/chrome-for-testing/


[Selenium Java] Bài 4: Cài đặt môi trường Selenium với Java | Anh Tester


Các bạn phải tải về đúng với version của Chrome mà mình đang dùng nhé


[Selenium Java] Bài 4: Cài đặt môi trường Selenium với Java | Anh Tester


Sau khi tải về, các bạn giải nén ra, sẽ ra một  tập tin tên là chromedriver.exe (trên Window), còn trên máy MAC là chromedriver

[Selenium Java] Lesson 4: Cài đặt môi trường Selenium với Java | Anh Tester


Nhớ lưu ý đường dẫn của nó, ví dụ mình đang bỏ ở ổ đĩa C và trong thư mục tên là Webdriver thì đường dẫn là C:\Webdriver\chromedriver.exe

4. Tải về Selenium Webdriver
   Trước hết, chúng ta hãy tải Selenium Webdriver về máy với link An đã chuẩn bị
   🔆 Link tải về từ tài nguyên: Tài nguyên cài đặt
   (Hiện tại chúng ta dùng bản 3.141.59 là bản v3 ổn nhất của Selenium WebDriver, tuy nhiên sau này nên dùng v4)

Đây là 1 file có đuôi là *.jar, hãy nhớ đường dẫn của nó để xíu dán cho đúng vào code


5. Cài đặt intellij-ide và tạo project auto test mới
   Eclipse thì các bạn tải ở đây:https://www.jetbrains.com/idea/download/?section=windows

🔆 Từ bản mới 2023 về sau intellij-Community Editon yêu cầu dùng JDK 21 trở lên nên các bạn chú ý nhé.

Các bạn tải về rồi nhấn cài đặt như các app khác thôi nhé.

