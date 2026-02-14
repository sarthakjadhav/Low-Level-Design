package lldPatterns.structural.bridge.report_format_eg.reports;

import lldPatterns.structural.bridge.report_format_eg.report_format.ReportFormat;

public class DemoReport extends Report {
    public DemoReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public String fetchData() {
        return "Demo data:\nMarket: Sales\n{\n\tIndia: $ 100B\n\tUS: $ 80B\n}";
    }
}
