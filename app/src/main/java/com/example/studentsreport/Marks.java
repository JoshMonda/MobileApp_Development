package com.example.studentsreport;

import java.util.ArrayList;
import java.util.List;

public class Marks {


    public String name,regno;
    public int sno,maths,english,kisw,chemistry,physics,biology,history,geography,cre,bstudies,agriculture,computer,total,position;

    public Marks() {

    }
    public Marks(int sno, String name, String regno, int english, int maths, int kisw, int chemistry, int physics, int biology, int history, int geography, int CRE, int BStudies, int agriculture, int computer) {
        this.sno = sno;
        this.name = name;
        this.regno = regno;
        this.english = english;
        this.maths = maths;
        this.kisw = kisw;
        this.chemistry = chemistry;
        this.physics = physics;
        this.biology = biology;
        this.history = history;
        this.geography = geography;
        this.cre = CRE;
        this.bstudies = BStudies;
        this.agriculture = agriculture;
        this.computer = computer;
        this.total = total;
        this.position = position;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getKisw() {
        return kisw;
    }

    public void setKisw(int kisw) {
        this.kisw = kisw;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getBiology() {
        return biology;
    }

    public void setBiology(int biology) {
        this.biology = biology;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public int getCre() {
        return cre;
    }

    public void setCre(int cre) {
        this.cre = cre;
    }

    public int getBstudies() {
        return bstudies;
    }

    public void setBstudies(int bstudies) {
        this.bstudies = bstudies;
    }

    public int getAgriculture() {
        return agriculture;
    }

    public void setAgriculture(int agriculture) {
        this.agriculture = agriculture;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public int addTotal()
    {

        return english+maths+kisw+chemistry+physics+biology+history+geography+cre+bstudies+agriculture+computer;
    }




    public List<Marks> GetMarks(){
        List<Marks> lstMarks = new ArrayList<Marks>();


        lstMarks.add(new Marks(1,"Joash","bit/017",65,70,58,60,69,77,80,60,89,62,78,73));
        lstMarks.add(new Marks(2,"Robert","bit/117",50,56,59,61,59,57,70,61,67,52,50,65));
        lstMarks.add(new Marks(3,"Emily","bit/127",45,67,68,50,69,67,60,50,59,72,60,53));
        lstMarks.add(new Marks(4,"John","bit/137",60,77,58,70,76,54,64,60,49,62,53,70));
        lstMarks.add(new Marks(5,"Victor","bit/147",66,60,47,60,59,70,68,70,59,52,55,63));
        lstMarks.add(new Marks(6,"Susan","bit/157",65,73,48,62,67,67,60,62,80,60,74,73));
        lstMarks.add(new Marks(7,"Alex","bit/167",70,71,58,50,59,75,60,65,67,61,50,71));
        lstMarks.add(new Marks(8,"Sheila","bit/177",65,70,68,64,70,60,78,61,65,62,54,54));
        lstMarks.add(new Marks(9,"Monda","bit/187",55,67,68,60,64,56,78,62,89,62,53,51));
        lstMarks.add(new Marks(10,"Enock","bit/197",70,70,71,70,61,57,67,60,78,62,56,73));

        return lstMarks;
    }
}
