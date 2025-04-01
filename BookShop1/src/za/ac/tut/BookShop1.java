/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.tut;

import java.util.ArrayList;
import java.util.Scanner;
import za.ac.tut.comicnovel.ComicNovel;

public class BookShop1 {

    public String globalDetails(ArrayList<ComicNovel> lists) {

        String concatValue = "";
        for (ComicNovel novel : lists) {
            concatValue += novel.getTitle() + " => " + novel.getCode() + "\n";
        }
        return concatValue;
    }

    public boolean isFirstEdition(ArrayList<ComicNovel> listsOfNovels, String code) {
        boolean isfirt = false;

        for (ComicNovel data : listsOfNovels) {
            if (data.getCode().equals(code)) {
                isfirt = true;
            }
        }
        return isfirt;
    }

    public static void main(String[] args) {

        String[] bookInfo = {"The Stupidest Angel#2#CM002",
            "Vile Bodies#8#EW008",
            "Cold Comfort Farm#1#SG001",
            "Lightning Rods#2#HDW002",
            "A Complicated Kindness#1#MT001",
            "Auntie Mame#9#PD009",
            "Catch-22#5#JH005",
            "The Color of Magic#1#TP001",
            "Lucky Jim#3#KA003"};
        ArrayList<ComicNovel> lists = new ArrayList<>();
        //declare,intialze and populate the comicNovel lists of objects
        for (String data : bookInfo) {
            String[] book1Parts = data.split("#");

            String title = book1Parts[0];
            int vol = (int) Integer.parseInt(book1Parts[1]);
            String code = book1Parts[2];

            lists.add(new ComicNovel(title, vol, code));
        }
        BookShop1 shop = new BookShop1();

        System.out.println("The list of comic novels with its search codes\n"
                + "================================================================");
        String allDetails = shop.globalDetails(lists);
        System.out.println(allDetails);

        System.out.println("Enter the code of a comic novel: ");
        Scanner kb = new Scanner(System.in);
        String userCode = kb.next();
        boolean isfirstEd = shop.isFirstEdition(lists, userCode);
        if (isfirstEd == true) {
            System.out.println("The comic novel with global code " + userCode + " is a first edition and is a collectors item");
        } else {
            System.out.println("The comic novel with global code " + userCode + " is NOT first edition so is NOT collectors item");
        }
        
        booksSold()
    }

}
