/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_hashmap;

/**
 *
 * @author Traivith
 */
public class Detail {
      public String detail1, detail2;

    @Override
    public String toString() {
        return detail1 + "," + detail2;
    }

    public Detail(String detail1, String detail2) {
        this.detail1 = detail1;
        this.detail2 = detail2;
    }

}
