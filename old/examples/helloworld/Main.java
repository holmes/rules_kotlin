package old.examples.helloworld;

import com.google.common.base.Joiner;
// Not actually a necessary import since both in same package


public class Main {

  public static void main(String[] args) {
    KotlinLibraryRule rule = new KotlinLibraryRule(
      "foo",
      new java.util.ArrayList(),
      new java.util.ArrayList());
    System.out.println("A bazel kotlin_library rule looks something like: ");
    System.out.println(rule.toString());
  }

  void testRuleName() {
    KotlinLibraryRule rule = new KotlinLibraryRule(
      "foo",
      new java.util.ArrayList(),
      new java.util.ArrayList());
    // Extremely simple test, avoid having to load junit or something
    // else here.
    if (!"foo".equals(rule.getName())) {
      throw new IllegalStateException("Expected rule name as 'foo', but got: " + rule.getName());
    }
  }
}
