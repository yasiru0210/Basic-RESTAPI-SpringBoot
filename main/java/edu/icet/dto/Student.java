package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Student {

    private int id;
    private  String lasiru;
    private  String piliyandala;
    private  String kasiru;
    private  String panadura;
    private  int i1;
    private String name;
    private String address;
    private int age;
    private  String nampamunuwa;
    private String painting;
    private String town;
    private String village;
    private String hobbby;

   public Student(int id, String lasiru, String piliyandala, int age, String nampamunuwa, String painting) {
       this.id = id;
       this.lasiru = lasiru;
       this.piliyandala = piliyandala;
       this.age = age;
       this.nampamunuwa = nampamunuwa;
       this.painting = painting;
   }

   public Student(int id, String kasiru, String panadura, int i1, String piliyandala, String nampamunuwa, String painting) {

       this.id = id;
       this.kasiru = kasiru;
       this.panadura = panadura;
       this.i1 = i1;

       this.piliyandala = piliyandala;
       this.nampamunuwa = nampamunuwa;
       this.painting = painting;
   }
}
