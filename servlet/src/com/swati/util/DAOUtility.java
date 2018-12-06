package com.swati.util;

import com.swati.dao.IUserDAO;
import com.swati.dao.UserDAO;
import com.swati.dao.UserDAOVer2;

public class DAOUtility {
public static IUserDAO getUserDAO()
{
	return new UserDAOVer2();
}
}
