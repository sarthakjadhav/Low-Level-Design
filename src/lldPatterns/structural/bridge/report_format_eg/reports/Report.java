package lldPatterns.structural.bridge.report_format_eg.reports;

import lldPatterns.structural.bridge.report_format_eg.report_format.ReportFormat;

public abstract class Report {
    protected ReportFormat reportFormat;

    public Report(ReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public abstract String fetchData();

    public void generate(){
        String data  = fetchData();
        reportFormat.generate(data);
    }
}
