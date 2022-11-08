package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vector<Shape> v = new Vector<Shape>();
        Shape s = null;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");

        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            int choiceMenu = Integer.parseInt(br.readLine());
            if (choiceMenu == 1) {
                System.out.print("Line(1), Rect(2), Circle(3)>> ");
                int choiceFigure = Integer.parseInt(br.readLine());
                if (choiceFigure == 1) {
                    s = new Line();
                }
                else if (choiceFigure == 2) {
                    s = new Rect();
                }
                else if (choiceFigure == 3) {
                    s = new Circle();
                }
                else {
                    System.out.println("잘못입력하셨습니다!");
                }
                v.add(s);
            }
            else if (choiceMenu == 2) {
                System.out.print("삭제할 도형의 위치>> ");
                int deletePosition = Integer.parseInt(br.readLine());
                if (v.size() == 0 || v.size() <= deletePosition) {
                    System.out.println("삭제할 수 없습니다.");
                }
                else {
                    v.remove(deletePosition);
                }
            }
            else if (choiceMenu == 3) {
                for (int i = 0; i < v.size(); i++) {
                    v.get(i).draw();
                }
            }
            else if (choiceMenu == 4) {
                System.out.println("beauty을 종료합니다!");
                br.close();
                return;
            }
            else {
                System.out.println("잘못입력하셨습니다!");
            }
        }
    }
}

abstract class Shape {
    public Shape() {}
    public abstract void draw();
}

class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}
