package oopExercises.encapsulationExercise;

public class Printer {
       int tonerLevel;
       int pagesPrinted;
       boolean duplex;

        public Printer(int tonerLevel, boolean duplex) {
            if (tonerLevel >= 0 && tonerLevel <= 100) {
                this.tonerLevel = tonerLevel;
            } else {
                this.tonerLevel = -1;
            }
            this.duplex = duplex;
            this.pagesPrinted = 0;
        }

        public int addToner(int tonerAmount) {
            if (tonerAmount > 0 && tonerAmount <= 100) {
                if (tonerLevel + tonerAmount > 100) {
                    return -1;
                }
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
            return -1;
        }

        public int printPages(int pages) {
            int pagesToPrint = pages;
            if (duplex) {
                pagesToPrint = (int) Math.ceil((double) pages / 2);
                System.out.println("Printing in duplex mode");
            }
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }

        public int getPagesPrinted() {
            return pagesPrinted;
        }
    }

