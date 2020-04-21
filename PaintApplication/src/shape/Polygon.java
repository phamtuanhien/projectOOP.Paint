/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author Đại
 */
public class Polygon extends Shape implements DrawType{
    // tạo danh sách chứa đường thẳng
    private ArrayList<Line> listLine = new ArrayList<Line>();

    public ArrayList<Line> getListLine() {
        return listLine;
    }
    
    // Thêm 1 đường thẳng vào danh sách
    public void addLine(Line line){
        listLine.add(line);
    }
    
    @Override
    public void draw(Graphics2D g2d) {
        for (int i = 0; i < listLine.size(); i++) {
            listLine.get(i).draw(g2d);
        }
    }
    
    
}
