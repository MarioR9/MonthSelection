import javax.swing.*;

/*
*Mario ROdriguez
*program will allow you to select months until cancel botton is press
*/
public class MonthSelection {
    public enum Months{
        January,February,March,April,May,June,July,August,September,October,November,December
    }
    public static void main(String[] args) {
        do {
            Months[] choices  ={Months.January,Months.February,Months.March,Months.April,Months.May,Months.June,Months.July,Months.August,Months.September,Months.October,Months.November,Months.December};
            Months input = (Months)JOptionPane.showInputDialog(null, "Choose now...", "The choise of a LifeTime", JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
            switch (input) {
                case December:
                case January:
                case February:
                    JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
                    break;
                case March:
                case April:
                case May:
                    JOptionPane.showMessageDialog(null, "Happy Spring days!");
                    break;
                case June:
                case July:
                case August:
                    JOptionPane.showMessageDialog(null, "It's summer time");
                    break;
                case September:
                case October:
                case November:
                    JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
                    break;
            }

        }while(JOptionPane.CANCEL_OPTION != 0);


    }
}



