// DECISION TREE  APPLICATION

package decisiontree3;

import java.io.*;

class DecisionTreeApp {

    /* ------------------------------- */
    /*                                 */
    /*              FIELDS             */
    /*                                 */
    /* ------------------------------- */

    static BufferedReader keyboardInput = new
            BufferedReader(new InputStreamReader(System.in));
    static DecisionTree_v3 newTree;

    /* --------------------------------- */
    /*                                   */
    /*               METHODS             */
    /*                                   */
    /* --------------------------------- */

    /* MAIN */

    public static void main(String[] args) throws IOException {

        // Create instance of class DecisionTree_v3

        newTree = new DecisionTree_v3();

        // Generate tree

        generateTree();

        // Output tree

        System.out.println("\nOUTPUT DECISION TREE");
        System.out.println("====================");
        newTree.outputBinTree();

        // Query tree

        queryTree();
    }

    /* GENERATE TREE */

    static void generateTree() {
        System.out.println("\nGENERATE DECISION TREE");
        System.out.println("======================");
        newTree.createRoot(1, "Red colored rashes");
        newTree.addYesNode(1, 2, "You have hepatitis");     // True, end of node
        newTree.addNoNode(1, 3, "Pain in the eyes");      // False move to node 3
        newTree.addYesNode(3, 4, "Sore throat");        // True move to node 4,6
        newTree.addNoNode(3, 5, "Yellowish eyes");      // False move to node 5
        newTree.addYesNode(4, 6, "Yellowish eyes");     // True move to node 6,10
        newTree.addNoNode(4, 7, "Loss of appetite");    // False move to node 7
        newTree.addYesNode(5, 8, "Sore throat");     // True move to node 8
        newTree.addNoNode(5, 9, "Headache");    // False move to node 9
        newTree.addYesNode(6, 10, "You have dengue fever");     // True, end of node
        newTree.addNoNode(6, 11, "Bodyache");    // False move to node 11
        newTree.addYesNode(7, 12, "Joint pains");     // True move to node 12
        newTree.addNoNode(7, 13, "Joint pains");    // False move to node 13
        newTree.addYesNode(8, 14, "Running nose");     // True move to node 14
        newTree.addNoNode(8, 15, "You have hepatitis");    // False, end of node
        newTree.addYesNode(9, 16, "You have flu");     // True, end of node
        newTree.addNoNode(9, 17, "Loss of appetite");    // False move to node 17
        newTree.addYesNode(11, 20, "Fever");     // True move to node 20
        newTree.addNoNode(11, 21, "Joint pains");    // False move to node 21
        newTree.addYesNode(12, 22, "Yellowish eyes");     // True move to node 23
        newTree.addNoNode(12, 23, "Yellowish eyes");    // False move to node 22
        newTree.addYesNode(13, 24, "You have dengue fever");     // True, end of node
        newTree.addNoNode(13, 25, "Coughing");    // False move to node 25
        newTree.addYesNode(14, 26, "Nausea");     // True move to node 26
        newTree.addNoNode(14, 27, "You have dengue fever");    // False, end of node
        newTree.addYesNode(17, 28, "Sore throat");     // True move to node 28
        newTree.addNoNode(17, 29, "Sore throat");    // False move to node 29
        newTree.addYesNode(20, 30, "Coughing");     // True move to node 30
        newTree.addNoNode(20, 31, "You have chicken pox");    // False, end of node
        newTree.addYesNode(21, 32, "Nausea");     // True move to node 32
        newTree.addNoNode(21, 33, "Nausea");    // False move to node 33
        newTree.addYesNode(22, 34, "You have hepatitis");     // True, end of node
        newTree.addNoNode(22, 35, "Bodyache");    // False move to node 35
        newTree.addYesNode(23, 36, "Scabs");     // True move to node 36
        newTree.addNoNode(23, 37, "Fever");    // False move to node 37
        newTree.addYesNode(25, 38, "You have hepatitis");     // True, end of node
        newTree.addNoNode(25, 39, "You have chicken pox");    // False, end of node
        newTree.addYesNode(26, 40, "You have dengue fever");     // True, end of node
        newTree.addNoNode(26, 41, "You have flu");    // False, end of node
        newTree.addYesNode(28, 42, "You have flu");     // True, end of node
        newTree.addNoNode(28, 43, "Fever");    // False move to node 43
        newTree.addYesNode(29, 44, "You have chicken pox");     // True, end of node
        newTree.addNoNode(29, 45, "You have flu");    // False, end of node
        newTree.addYesNode(30, 46, "You have hepatitis");     // True, end of node
        newTree.addNoNode(30, 47, "You have chicken pox");    // False, end of node
        newTree.addYesNode(32, 48, "You have dengue fever");     // True, end of node
        newTree.addNoNode(32, 49, "You have chicken pox");    // False, end of node
        newTree.addYesNode(33, 50, "You have hepatitis");     // True, end of node
        newTree.addNoNode(33, 51, "You have dengue fever");    // False, end of node
        newTree.addYesNode(35, 52, "You have chicken pox");     // True, end of node
        newTree.addNoNode(35, 53, "You have dengue fever");    // False, end of node
        newTree.addYesNode(36, 54, "Bodyache");     // True move to node 54
        newTree.addNoNode(36, 55, "You have chicken pox");    // False, end of node
        newTree.addYesNode(37, 56, "You have hepatitis");     // True, end of node
        newTree.addNoNode(37, 57, "You have chicken pox");    // False, end of node
        newTree.addYesNode(43, 58, "You have hepatitis");     // True, end of node
        newTree.addNoNode(43, 59, "You have flu");    // False, end of node
        newTree.addYesNode(54, 60, "You have chicken pox");     // True, end of node
        newTree.addNoNode(54, 61, "You have flu");    // False, end of node
    }

    /* QUERY TREE */

    private static void queryTree() throws IOException {
        System.out.println("\nQUERY DECISION TREE");
        System.out.println("===================");
        newTree.queryBinTree();

        // Option to exit

        optionToExit();
    }

    /* OPTION TO EXIT PROGRAM */

    private static void optionToExit() throws IOException {
        System.out.println("Exit? (enter \"Yes\" or \"No\")");
        String answer = keyboardInput.readLine();
        if (answer.equals("Yes"))
            return;
        else {
            if (answer.equals("No")) queryTree();
            else {
                System.out.println("ERROR: Must answer \"Yes\" or \"No\"");
                optionToExit();
            }
        }
    }
}
