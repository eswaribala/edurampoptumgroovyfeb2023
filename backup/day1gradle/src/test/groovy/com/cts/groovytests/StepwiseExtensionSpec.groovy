package com.cts.groovytests;



import spock.lang.*

/**
 * Demonstrates how &#64;Stepwise causes a spec to be run in incremental steps.
 * Change a step's condition from <tt>true</tt> to <tt>false</tt>, and observe
 * how the remaining steps will be skipped automatically on the next run.
 * Also notice that if you run a single step (e.g. from the IDE's context menu),
 * all prior steps will also be run.
 *
 * <p><tt>&#64;Stepwise</tt> is particularly useful for higher-level specs whose
 * methods have logical dependencies.
 *
 * @since 0.4
 */
@Stepwise
class StepwiseExtensionSpec extends Specification {
  def "step 1"() {
    expect: true // try to change this to 'false'
  }

  def "step 2"() {
    expect: true
  }

  def "step 3"() {
    expect: true
  }
}
