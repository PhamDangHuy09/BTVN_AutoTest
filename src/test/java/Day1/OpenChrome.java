package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://serenity-bdd.github.io/");
        driver.manage().window().maximize();
        driver.quit();
    }
}

/*
2. Tìm hiểu một vài framework: Cucumber using Serenity BDD and Screenplay: https://serenity-bdd.github.io/docs/tutorials/cucumber-screenplay playwright: https://playwright.dev/docs/intro
trả lời :
        -Serenity BDD là framework hỗ trợ Automation Testing theo mô hình BDD
        - Cucumber là framework hỗ trợ viết test bằng ngôn ngữ tự nhiên (Gherkin).
        - Screenplay là mô hình thiết kế giúp tổ chức code Automation Testing rõ ràng hơn.
        - Playwright là framework Automation Testing mã nguồn mở do Microsoft phát triển.
3. Trả lời các câu hỏi:
Automation test là gì?
Tại sao cần auto test?
Khi nào cần chạy kịch bản auto test?
Có mấy loại serenium? kể tên?
trả lời:
        - Automation Test là quá trình sử dụng các công cụ hoặc chương trình để tự động thực hiện các test case, so sánh kết quả thực tế với kết quả mong đợi và tạo báo cáo mà không cần tester thao tác thủ công.
        - Auto Test giúp ta:
            + Tiết kiệm thời gian
            + Phát hiện lỗi nhanh hơn
            + Giảm chi phí kiểm thử
            + Giảm lỗi do thao tác thủ công
        - Nên chạy Automation Test trong các trường hợp:
            + Sau mỗi lần lập trình viên cập nhật code
            + Kiểm thử các chức năng được sử dụng thường xuyên
            + Kiểm thử trên nhiều trình duyệt (Chrome, Firefox, Edge,...).
            + Kiểm thử với nhiều bộ dữ liệu khác nhau.
        - Có 4 loại selenium
            + Selenium IDE
            + Selenium WebDriver
            + Selenium Grid
            + Selenium Manager
 */