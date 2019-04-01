/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uvigo.esei.dojos.swing.todo.core;

import java.util.Iterator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class TodoListTest {
    
    public TodoListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of moveUp method, of class TodoList.
     */
    @Test
public void testMoveUp() 
{
  System.out.println("MoveUp");
  int i=0;
    TodoList instance= new TodoList();
    String item="kalpana";
    instance.add(item);
    item="Sreekanth";
    instance.add(item);
    item="Srinath";
    instance.add(item);
    instance.moveUp(1);
    String expResult="Sreekanth";
    String result=instance.elementAt(0);
    assertEquals(expResult,result);
    System.out.println("Entry has moved upto one position" +result);
}

@Test
public void testMoveDown() 
{
System.out.println("MoveDown");
  int i=0;
    TodoList instance= new TodoList();
    String item="kalpana";
    instance.add(item);
    item="Sreekanth";
    instance.add(item);
    item="Srinath";
    instance.add(item);
    instance.moveUp(1);
    String expResult="Sreekanth";
    instance.moveDown(0);
    String actual=instance.elementAt(1);
    assertEquals(expResult,actual);
    System.out.println("Entry has moved down one position" +actual);
}

@Test
public void testAdd() 
{
    System.out.println("add");
    String item="kalpana";
    TodoList instance= new TodoList();
    instance.add(item);
    int i= instance.size();
    assertTrue(i>0);
    System.out.println("Entry added to the list");

}

@Test
public void testEditAt() 
{
System.out.println("MoveDown");
  int i=0;
    TodoList instance= new TodoList();
    String item="kalpana";
    instance.add(item);
    item="Sreekanth";
    instance.add(item);
    item="Srinath";
    instance.add(item);
    instance.moveUp(1);
    String expResult="Srinath";
    instance.moveDown(0);
    String result=instance.elementAt(2);
    assertEquals(expResult,result);
    System.out.println("Entry is found" +result);
}

@Test
public void testRemoveAt() 
{
System.out.println("removeAt");
     TodoList instance= new TodoList();
        String item="kalpana";
    instance.add(item);
    instance.removeAt(0);
    int i= instance.size();
    assertTrue(i==0);
    System.out.println("Entry removed from the list");
}

@Test
public void testSize() 
{
System.out.println("size");
     TodoList instance= new TodoList();
        String item="kalpana";
    instance.add(item);
    item="Sreekanth";
    instance.add(item);
    item="Srinath";
    instance.add(item);
   int expResult=3;
    int actual= instance.size();
    assertEquals(expResult,actual);
        System.out.println("size of the array is" +actual);
}
    
}
