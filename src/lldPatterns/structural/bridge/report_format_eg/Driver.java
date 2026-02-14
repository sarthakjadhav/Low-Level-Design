package lldPatterns.structural.bridge.report_format_eg;

import lldPatterns.structural.bridge.report_format_eg.report_format.JSONReport;
import lldPatterns.structural.bridge.report_format_eg.report_format.PDFReport;
import lldPatterns.structural.bridge.report_format_eg.report_format.ReportFormat;
import lldPatterns.structural.bridge.report_format_eg.report_format.SalesReport;
import lldPatterns.structural.bridge.report_format_eg.reports.AuditReport;
import lldPatterns.structural.bridge.report_format_eg.reports.CSVReport;
import lldPatterns.structural.bridge.report_format_eg.reports.DemoReport;
import lldPatterns.structural.bridge.report_format_eg.reports.Report;

public class Driver {
    public static void main(String[] args){
        ReportFormat reportFormat = new PDFReport();
        Report report = new SalesReport(reportFormat);
        report.generate();
        System.out.println("-------------------------------------------");

        Report r1 = new AuditReport(new CSVReport());
        r1.generate();
        System.out.println("-------------------------------------------");

        Report r2 = new DemoReport(new JSONReport());
        r2.generate();
        System.out.println("-------------------------------------------");
    }
}
