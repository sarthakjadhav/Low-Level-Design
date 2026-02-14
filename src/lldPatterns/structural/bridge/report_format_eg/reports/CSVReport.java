package lldPatterns.structural.bridge.report_format_eg.reports;

import lldPatterns.structural.bridge.report_format_eg.report_format.ReportFormat;

public class CSVReport implements ReportFormat {
    @Override
    public void generate(String content) {
        System.out.println("Generating CSV report");
        System.out.println(content);
    }
}
