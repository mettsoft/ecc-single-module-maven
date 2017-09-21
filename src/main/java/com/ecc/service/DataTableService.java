package com.ecc.service;

import java.util.Map;
import org.apache.commons.lang3.tuple.ImmutablePair;

public interface DataTableService {

	void printDataTable();

	Map<ImmutablePair<Integer, Integer>, Integer> search(String keyword);

	void replaceByKey(Integer rowIndex, Integer columnIndex, String replacement);

	void replaceByValue(Integer rowIndex, Integer columnIndex, String replacement);

	void reset(Integer numberOfRows, Integer numberOfColumns, Integer cellSize) throws Exception;

	void add(String rowValues) throws Exception;

	void sort();
}