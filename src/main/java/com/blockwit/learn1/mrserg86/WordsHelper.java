//Написать класс WordsHelper. В нем метод printRubleWord, который принимает на вход целое число и
// возвращает слово "рубль" в соответствующем числу падеже.
// Точку входа написать в классе ExtTask1 и привести пример использования printRubleWord.

package com.blockwit.learn1.mrserg86;

    public class WordsHelper {

        public String printRubleWord(int money) {
            int moneyForChecking = money;
            String rubl = null;

        if(moneyForChecking == 1) {
            rubl = "рубль";
        }
        else if(moneyForChecking == 2 || moneyForChecking == 3 || moneyForChecking == 4) {
            rubl = "рубля";
        }
        else if(moneyForChecking == 5 || moneyForChecking == 6 || moneyForChecking == 7 ||
                moneyForChecking == 8 || moneyForChecking == 9) {
            rubl = "рублей";
        }
        else if(moneyForChecking % 100 == 11 || moneyForChecking % 100 == 12 || moneyForChecking % 100 == 13 ||
                moneyForChecking % 100 == 14 || moneyForChecking % 100 == 15 || moneyForChecking % 100 == 16 ||
                moneyForChecking % 100 == 18 || moneyForChecking % 100 == 19) {
            rubl="рублей";
        }
        else if(moneyForChecking % 10 == 1) {
                rubl = "рубль";
            }
        else if(moneyForChecking % 10 == 2 || moneyForChecking % 10 == 3 || moneyForChecking % 10 == 4) {
                rubl = "рубля";
            }
        else if(moneyForChecking % 10 == 5 || moneyForChecking % 10 == 6 || moneyForChecking % 10 == 7 ||
                moneyForChecking % 10 == 8 || moneyForChecking % 10 == 9 || moneyForChecking % 10 == 0) {
                rubl = "рублей";
            }
        return rubl;
        }

    }
