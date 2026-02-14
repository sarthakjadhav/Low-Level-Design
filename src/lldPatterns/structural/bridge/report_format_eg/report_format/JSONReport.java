package lldPatterns.structural.bridge.report_format_eg.report_format;

public class JSONReport implements ReportFormat{
    @Override
    public void generate(String content) {
        System.out.println("Generating JSON report");
        System.out.println(content);
    }
}
