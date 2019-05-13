package com.example.Pdf;

import org.springframework.web.servlet.View;
import java.awt.Color;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class Mypdf extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document,
                                    PdfWriter writer, HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {

        //response.setHeader("Content-Disposition", "attachment; filename=\"user_list.pdf\"");

        @SuppressWarnings("unchecked")
        List<Emp> list = (List<Emp>) model.get("emp");

        Table table = new Table(3);
        table.setBorderWidth(1);
        table.setBorderColor(new Color(0, 0, 255));

        Cell cell = new Cell("Billing invoice");
        cell.setHeader(true);
        cell.setColspan(3);
        table.addCell(cell);
        table.endHeaders();

        cell = new Cell("Ginusis corp, arjun garh, new Delhi- 511203");
        cell.setColspan(3);
        cell.setRowspan(3);
        cell.setBorderColor(new Color(25, 250, 10));
        table.addCell(cell);

        table.addCell("ID");
        table.addCell("NAME");
        table.addCell("MODE");
        table.addCell("PRODUCT");
        table.addCell("AMOUNT");
        table.addCell("DISCOUNT");
        table.addCell("QTY");

        for(Emp emp : list){
            table.addCell(String.valueOf(emp.id));
            table.addCell(emp.name);
            table.addCell(emp.age);
            table.addCell(emp.age);
        }

        document.add(table);
    }

}