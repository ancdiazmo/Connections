package com.Queryators;

import java.sql.ResultSet;

public interface Queryator {
	public ResultSet executeQuery (String query);
}
