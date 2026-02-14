package lldPatterns.structural.bridge.report_format_eg.report_format;

public class PDFReport implements ReportFormat{
    @Override
    public void generate(String content) {
        System.out.println("Generating PDF report");
        System.out.println(content);
    }
}
