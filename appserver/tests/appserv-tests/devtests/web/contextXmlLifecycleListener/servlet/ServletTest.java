/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package test;

import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import javax.naming.*;
import javax.sql.*;
import java.sql.*;

public class ServletTest extends HttpServlet implements HttpSessionListener {

    private ServletContext context;
    
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("[Servlet.init]");
    }

    public void service(ServletRequest req, ServletResponse res)
            throws IOException, ServletException {

        System.out.println("[Servlet.service]");

        if (!"initParamValue".equals(
                getServletContext().getInitParameter("initParamName"))) {
            throw new ServletException("Missing servlet init param");
        }

    }

    public void sessionCreated(javax.servlet.http.HttpSessionEvent httpSessionEvent) {
        System.out.println("[Servlet.sessionCreated]");
    }
    
    public void sessionDestroyed(javax.servlet.http.HttpSessionEvent httpSessionEvent) {
        System.out.println("[Servlet.sessionDestroyed]");
    }
}



