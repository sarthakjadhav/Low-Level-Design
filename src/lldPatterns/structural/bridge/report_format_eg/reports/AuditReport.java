package lldPatterns.structural.bridge.report_format_eg.reports;

import lldPatterns.structural.bridge.report_format_eg.report_format.ReportFormat;

public class AuditReport extends Report {
    public AuditReport(ReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public String fetchData() {
        return "Audit data:\nHi team,\nWe are done with Audit.\n";
    }
}
