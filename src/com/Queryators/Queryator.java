package com.Queryators;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface Queryator {
	public ResultSet executeQuery (String query);
	public void CloseConection ();
}
