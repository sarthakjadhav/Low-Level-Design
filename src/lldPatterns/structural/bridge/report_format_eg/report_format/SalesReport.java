package lldPatterns.structural.bridge.report_format_eg.report_format;

import lldPatterns.structural.bridge.report_format_eg.reports.Report;

public class SalesReport extends Report {
    public SalesReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public String fetchData() {
        return "Sales data:\nHi team,\nThis year, sales has increased significantly compared to last year.\nThanks,\nCEO";
    }
}
