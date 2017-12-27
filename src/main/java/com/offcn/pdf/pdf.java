package com.offcn.pdf;

import org.junit.Test;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfDocumentInfo;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

public class pdf {
	
	
     @Test
	public void text1()throws Exception{
		
		PdfWriter write=new PdfWriter("d:\\MyDownloads\\hellow2.pdf");
		
		PdfDocument pdfdoc=new PdfDocument(write);
		
		
		//��������
		PdfDocumentInfo info=pdfdoc.getDocumentInfo();
		info.setAuthor("С����");
		info.setCreator("kai");
		info.setKeywords("JAVA,ѧϰ,jsp,���");
		info.setSubject("�ĵ�����");
		info.setTitle("javaѧϰ");
		
		
		Document doc=new Document(pdfdoc);
		
		doc.add(new Paragraph("hellow my love!"));
		
		doc.close();
		
		System.out.println("ok");
		
	}
     
     
     
     @Test
 	public void text2()throws Exception{
 		
 		PdfWriter write=new PdfWriter("d:\\MyDownloads\\hellow3.pdf");
 		
 		PdfDocument pdfdoc=new PdfDocument(write);
 		
 		
 		//��������
 		PdfDocumentInfo info=pdfdoc.getDocumentInfo();
 		info.setAuthor("С����");
 		info.setCreator("kai");
 		info.setKeywords("JAVA,ѧϰ,jsp,���");
 		info.setSubject("�ĵ�����");
 		info.setTitle("javaѧϰ");
 		
 		
 		Document doc=new Document(pdfdoc);
 		
 		//�����������

 		Paragraph pa= new Paragraph("Сϱ����!");
 		
 		pa.setTextAlignment(TextAlignment.CENTER);
 		PdfFont font=PdfFontFactory.createFont("STSongStd-Light","UniGB-UCS2-H",false);
 		//�趨����
 		pa.setFont(font);
 		
 		pa.setFontColor(Color.PINK);
 		
 		pa.setFontSize(50F);
 		
 		doc.add(pa);
 		
 		doc.close();
 		
 		System.out.println("ok");
 		
 	}
     
     
     
     
     @Test
  	public void text3()throws Exception{
  		
  		PdfWriter write=new PdfWriter("d:\\MyDownloads\\hellow6.pdf");
  		
  		PdfDocument pdfdoc=new PdfDocument(write);
  		
  		
  		//��������
  		PdfDocumentInfo info=pdfdoc.getDocumentInfo();
  		info.setAuthor("С����");
  		info.setCreator("kai");
  		info.setKeywords("JAVA,ѧϰ,jsp,���");
  		info.setSubject("�ĵ�����");
  		info.setTitle("javaѧϰ");
  		
  		
  		Document doc=new Document(pdfdoc);
  		
  		//�����������

  		Paragraph pa= new Paragraph("Сϱ����!");
  		
  		pa.setTextAlignment(TextAlignment.CENTER);
  		PdfFont font=PdfFontFactory.createFont("STSongStd-Light","UniGB-UCS2-H",false);
  		//�趨����
  		pa.setFont(font);
  		
  		pa.setFontColor(Color.PINK);
  		
  		pa.setFontSize(50F);
  		
  	//����һ��������,
  		Table table=new Table(new float[]{30,30,30,30,30});
  		
  	//�趨������ĵ�����Ŀ��ռ��
  		table.setWidthPercent(30);
  		
  	//������Ԫ�����
  		Cell cell1=new Cell(1,5);
  		
  		cell1.setBackgroundColor(Color.YELLOW);
  		Paragraph pa1= new Paragraph("С�ϻ���!");
  		
  		pa1.setFont(font);
  		pa1.setFontColor(Color.RED);
  		
  		cell1.add(pa1);
  		cell1.setTextAlignment(TextAlignment.CENTER);
  		
  		table.addCell(cell1);
  		
  		
  		for(int i=0;i<30;i++){
  			Cell cella=new Cell(1,1);
  			cella.add(new Paragraph(""+(i+1)));
  			cella.setTextAlignment(TextAlignment.CENTER);
  			table.addCell(cella);
  			
  		}

  		
  		
  		
  		Cell cell2=new Cell(2,1);
  		
  		cell2.add(new Paragraph("2-1"));
  		
  		cell2.setTextAlignment(TextAlignment.CENTER);
  		
  		table.addCell(cell2);
  		
  		for(int i=0;i<8;i++){
  			Cell cellb=new Cell(1,1);
  			cellb.add(new Paragraph(""+(i+1)));
  			cellb.setTextAlignment(TextAlignment.CENTER);
  			table.addCell(cellb);
  			
  		}
  		
  		
  		
  		
  		doc.add(table);
  		
  		doc.add(pa);
  		
  		doc.close();
  		
  		System.out.println("ok");
  		
  	}
     
     
     
     
     
     
     
     @Test
   	public void text4()throws Exception{
   		
   		PdfWriter write=new PdfWriter("d:\\MyDownloads\\hellow5.pdf");
   		
   		PdfDocument pdfdoc=new PdfDocument(write);
   		
   		
   		//��������
   		PdfDocumentInfo info=pdfdoc.getDocumentInfo();
   		info.setAuthor("С����");
   		info.setCreator("kai");
   		info.setKeywords("JAVA,ѧϰ,jsp,���");
   		info.setSubject("�ĵ�����");
   		info.setTitle("javaѧϰ");
   		
   		
   		Document doc=new Document(pdfdoc);
   		
   		
   	//����һ��������,
   		Table table=new Table(new float[]{30,30,30,30,30});
   		
   	//�趨������ĵ�����Ŀ��ռ��
   		table.setWidthPercent(80);
   		
   	//������Ԫ�����
   		Cell cell1=new Cell(1,5);
   		
   		cell1.setBackgroundColor(Color.YELLOW);
   		Paragraph pa1= new Paragraph("�ܾ����");
   		PdfFont font=PdfFontFactory.createFont("STSongStd-Light","UniGB-UCS2-H",false);
   		pa1.setFont(font);
   		pa1.setFontColor(Color.RED);
   		
   		cell1.add(pa1);
   		cell1.setTextAlignment(TextAlignment.CENTER);
   		
   		table.addCell(cell1);
   		
   		
   		Cell cell2=new Cell(1,1);
   		
   		
   		Paragraph pa2= new Paragraph("��Ŀ");
   		pa2.setFont(font);
   		pa2.setFontColor(Color.BLACK);
   		cell2.add(pa2);
   		cell2.setTextAlignment(TextAlignment.CENTER);
   		
   		table.addCell(cell2);
   		
   		for(int i=0;i<4;i++){
   			Cell cella=new Cell(1,1);  			
   			cella.setTextAlignment(TextAlignment.CENTER);
   			table.addCell(cella);
   			
   		}

   		
   		//3
   		

   		Cell cell3=new Cell(1,1);
   		
   		
   		Paragraph pa3= new Paragraph("�в���");
   		pa3.setFont(font);
   		pa3.setFontColor(Color.BLACK);
   		cell3.add(pa3);
   		cell3.setTextAlignment(TextAlignment.CENTER);
   		
   		table.addCell(cell3);
   		
   		for(int i=0;i<4;i++){
   			Cell cella=new Cell(1,1);  			
   			cella.setTextAlignment(TextAlignment.CENTER);
   			table.addCell(cella);
   			
   		}

   		//4
   		
        Cell cell4=new Cell(1,1);
   		
   	
   		Paragraph pa4= new Paragraph("�ز���");
   		pa4.setFont(font);
   		pa4.setFontColor(Color.BLACK);
   		cell4.add(pa4);
   		cell4.setTextAlignment(TextAlignment.CENTER);
   		
   		table.addCell(cell4);
   		
   		for(int i=0;i<4;i++){
   			Cell cella=new Cell(1,1);  			
   			cella.setTextAlignment(TextAlignment.CENTER);
   			table.addCell(cella);
   			
   		}
   		
   		
   		//
   		Cell cell5=new Cell(1,1);
   		table.addCell(cell5);
   		
   		Cell cell6=new Cell(1,4);
   		table.addCell(cell6);
   		Paragraph pa6= new Paragraph("��Ҫ����Ч��");
   		pa6.setFont(font);
   		pa6.setFontColor(Color.BLACK);
   		cell6.add(pa6);
   		cell6.setTextAlignment(TextAlignment.CENTER);
   		
   		
   		
   		//
   		Cell cell7=new Cell(2,1);
   		table.addCell(cell7);
   		cell7.setHeight(50);
   		
   		Cell cell8=new Cell(2,4);
   		table.addCell(cell8);
   		cell8.setHeight(50);
   		
   		doc.add(table);
   		 		
   		
   		doc.close();
   		
   		System.out.println("ok");
   		
   	}
     
  
    
     @Test
    	public void text5()throws Exception{
    		
    		PdfWriter write=new PdfWriter("d:\\MyDownloads\\hellow8.pdf");
    		
    		PdfDocument pdfdoc=new PdfDocument(write);
    		
    		
    		//��������
    		PdfDocumentInfo info=pdfdoc.getDocumentInfo();
    		info.setAuthor("С����");
    		info.setCreator("kai");
    		info.setKeywords("JAVA,ѧϰ,jsp,���");
    		info.setSubject("�ĵ�����");
    		info.setTitle("javaѧϰ");
    		
    		
    		Document doc=new Document(pdfdoc);
    		
    		
    	//����һ��������,
    		Table table=new Table(new float[]{30,30,30,30,30});
    		
    	//�趨������ĵ�����Ŀ��ռ��
    		table.setWidthPercent(80);
    		
    	//������Ԫ�����
    		Cell cell1=new Cell(1,5);
    		
    		cell1.setBackgroundColor(Color.YELLOW);
    		Paragraph pa1= new Paragraph("�ܾ����");
    		PdfFont font=PdfFontFactory.createFont("STSongStd-Light","UniGB-UCS2-H",false);
    		pa1.setFont(font);
    		pa1.setFontColor(Color.RED);
    		
    		cell1.add(pa1);
    		cell1.setTextAlignment(TextAlignment.CENTER);
    		
    		table.addCell(cell1);
    		
    		String[] str={"�Ŀ","�Гܿ�","�t�ܿ�"};
    		
    		for(int i=0;i<str.length;i++){
    			Cell cella=new Cell(1,1); 
    			Paragraph pa2= new Paragraph(str[i]);
    			pa2.setFont(font);
    			cella.add(pa2);
    			cella.setTextAlignment(TextAlignment.CENTER);
    			table.addCell(cella);
    			for(int j=0;j<4;j++){
        						
    				Cell cell=new Cell(1,1); 
        			table.addCell(cell);
        			
        		}
    			
    			
    		}
    		

    		Cell cell5=new Cell(1,1);
    		table.addCell(cell5);
    		
    		Cell cell6=new Cell(1,4);
    		table.addCell(cell6);
    		Paragraph pa6= new Paragraph("��Ҫ����Ч��");
    		pa6.setFont(font);
    		pa6.setFontColor(Color.BLACK);
    		cell6.add(pa6);
    		cell6.setTextAlignment(TextAlignment.CENTER);
    		
    		
    		
    		//
    		Cell cell7=new Cell(2,1);
    		table.addCell(cell7);
    		cell7.setHeight(50);
    		
    		Cell cell8=new Cell(2,4);
    		table.addCell(cell8);
    		cell8.setHeight(50);
    		
    		doc.add(table);
    		 		
    		
    		doc.close();
    		
    		System.out.println("ok");
    		
    	}
      
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     @Test
  	public void text6()throws Exception{
  		
  		PdfWriter write=new PdfWriter("d:\\MyDownloads\\hellow-pic.pdf");
  		
  		PdfDocument pdfdoc=new PdfDocument(write);
  		
  		
  		//��������
  		PdfDocumentInfo info=pdfdoc.getDocumentInfo();
  		info.setAuthor("С����");
  		info.setCreator("kai");
  		info.setKeywords("JAVA,ѧϰ,jsp,���");
  		info.setSubject("�ĵ�����");
  		info.setTitle("javaѧϰ");
  		
  		
  		Document doc=new Document(pdfdoc);
  		
  		//�����������

  		Paragraph pa= new Paragraph("Сϱ����!");
  		
  		pa.setTextAlignment(TextAlignment.CENTER);
  		PdfFont font=PdfFontFactory.createFont("STSongStd-Light","UniGB-UCS2-H",false);
  		//�趨����
  		pa.setFont(font);
  		
  		pa.setFontColor(Color.PINK);
  		
  		pa.setFontSize(50F);
  		
  		doc.add(pa);
  		
  	//����һ��ͼƬ�Ķ���
  		Image pic1=new Image(ImageDataFactory.create("d:\\MyDownloads\\1.jpg"));

  		doc.add(pic1);
  		
  		
  		
  		doc.close();
  		
  		System.out.println("ok");
  		
  	}
}
