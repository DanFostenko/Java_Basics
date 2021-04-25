package testpackage;

import basicspackage.ClassesAnimal;
import basicspackage.ClassesDog;

public class ClassesEncapsulationHotKeys extends ClassesAnimal {
    void method() {
        ClassesDog dog = new ClassesDog();
        dog.var = 10;   //  public variable is available in the class from another package
        //dog.var2 = 10;   //  private variable isn't available in the class from another package
        //dog.var3 = 10;   //  protected variable is available in the class from inherited package
        //dog.var4 = 10;   //  package variable isn't available in the class from inherited package

        dog.getWeight(); //  access private variable through indirect getter&setter methods

        /*Hot Keys
         * Name of class. Ctrl+Space provides the list of classes, methods and variables
         * Ctrl+click reference observation of component
         * Alt+Insert generates code like constructor, Getter/Setter
         * Ctrl+O override method
         * Highlight the line Ctrl+Alt+T surrounds the line with cycle or condition
         * Ctrl+/, Ctrl+Shift+/ comment line(s)
         * Alt+Enter provides possible solutions for problem
         * Ctrl+Alt+O removes unused imports
         * Ctrl+Alt+L formats code within a page
         * Ctrl+D duplicates the line
         * Ctrl+Y remove the line
         * Ctrl+X / Ctrl+V  cuts / pastes the line
         * Ctrl+Shift+↑↓ moves the line in code
         * Alt+highlight highlights the dynamically selected code, allows bulk edit of lines
         * Ctrl+Delete, Ctrl+Backspace deletes the whole word
         * Click on method Alt+F7 lookup all using of the method
         * Ctrl+N class navigator
         * Ctrl+Shift+N look for all files
         * Ctrl+J line navigator by number
         * Shift+F6 Rename refactoring
         * Alt+Shift+C Review recent changes in project
         * */
    }
}
