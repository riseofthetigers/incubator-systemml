package com.ibm.bi.dml.test.integration.functions.binary.matrix;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/** Group together the tests in this package into a single suite so that the Maven build
 *  won't run two of them at once. */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	BinUaggChainTest.class,
	ElementwiseAdditionMultiplicationTest.class,
	ElementwiseAdditionTest.class,
	ElementwiseDivisionTest.class,
	ElementwiseModulusTest.class,
	ElementwiseMultiplicationTest.class,
	ElementwiseSubtractionTest.class,
	FullMatrixMultiplicationUltraSparseTest.class,
	MapMultChainTest.class,
	MapMultLimitTest.class,
	MatrixMultiplicationTest.class,
	MatrixVectorTest.class,
	OuterProductTest.class,
	ScalarAdditionTest.class,
	ScalarDivisionTest.class,
	ScalarModulusTest.class,
	ScalarMultiplicationTest.class,
	ScalarSubtractionTest.class,
	UltraSparseMRMatrixMultiplicationTest.class
})


/** This class is just a holder for the above JUnit annotations. */
public class ZPackageSuite {

}