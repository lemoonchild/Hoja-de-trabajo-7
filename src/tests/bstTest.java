package tests;

import Controller.compareWords;
import Controller.extractMainWord;
import Model.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * The type Binary tree test.
 */
class BinaryTreeTest {

    compareWords compare = new compareWords();
    extractMainWord mainWord = new extractMainWord<>();
    BinarySearchTree testTree = new BinarySearchTree(compare,mainWord);



    @Test
    public void testInsertAndSearch() {

        testTree.insert("dog", "perro");
        testTree.insert("woman", "mujer");
        testTree.insert("cat", "gato");
        testTree.insert("apple", "manzana");


        assertEquals("perro", testTree.search("dog").toString());
        assertEquals("mujer", testTree.search("woman").toString());
        assertEquals("gato", testTree.search("cat").toString());
        assertEquals("manzana", testTree.search("apple").toString());

    }
}