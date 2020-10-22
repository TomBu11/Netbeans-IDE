/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author Tom
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<!DOCTYPE html>\n" +
"<html>\n" +
"    <head>\n" +
"		<title>Test</title>\n" +
"\n" +
"		<style>\n" +
"			/* Include the padding and border in an element's total width and height */\n" +
"			* {\n" +
"			  box-sizing: border-box;\n" +
"			}\n" +
"\n" +
"			/* Remove margins and padding from the list */\n" +
"			ul {\n" +
"			  margin: 0;\n" +
"			  padding: 0;\n" +
"			}\n" +
"\n" +
"			/* Style the list items */\n" +
"			ul li {\n" +
"			  cursor: pointer;\n" +
"			  position: relative;\n" +
"			  padding: 12px 8px 12px 40px;\n" +
"			  background: #eee;\n" +
"			  font-size: 18px;\n" +
"			  transition: 0.2s;\n" +
"\n" +
"			  /* make the list items unselectable */\n" +
"			  -webkit-user-select: none;\n" +
"			  -moz-user-select: none;\n" +
"			  -ms-user-select: none;\n" +
"			  user-select: none;\n" +
"			}\n" +
"\n" +
"			/* Set all odd list items to a different color (zebra-stripes) */\n" +
"			ul li:nth-child(odd) {\n" +
"			  background: #f9f9f9;\n" +
"			}\n" +
"\n" +
"			/* Darker background-color on hover */\n" +
"			ul li:hover {\n" +
"			  background: #ddd;\n" +
"			}\n" +
"\n" +
"			/* When clicked on, add a background color and strike out text */\n" +
"			ul li.checked {\n" +
"			  background: #888;\n" +
"			  color: #fff;\n" +
"			  text-decoration: line-through;\n" +
"			}\n" +
"\n" +
"			/* Add a \"checked\" mark when clicked on */\n" +
"			ul li.checked::before {\n" +
"			  content: '';\n" +
"			  position: absolute;\n" +
"			  border-color: #fff;\n" +
"			  border-style: solid;\n" +
"			  border-width: 0 2px 2px 0;\n" +
"			  top: 10px;\n" +
"			  left: 16px;\n" +
"			  transform: rotate(45deg);\n" +
"			  height: 15px;\n" +
"			  width: 7px;\n" +
"			}\n" +
"\n" +
"			/* Style the close button */\n" +
"			.close {\n" +
"			  position: absolute;\n" +
"			  right: 0;\n" +
"			  top: 0;\n" +
"			  padding: 12px 16px 12px 16px;\n" +
"			}\n" +
"\n" +
"			.close:hover {\n" +
"			  background-color: #f44336;\n" +
"			  color: white;\n" +
"			}\n" +
"\n" +
"			/* Style the header */\n" +
"			.header {\n" +
"			  background-color: #467778;\n" +
"			  padding: 30px 40px;\n" +
"			  color: white;\n" +
"			  text-align: center;\n" +
"			}\n" +
"\n" +
"			/* Clear floats after the header */\n" +
"			.header:after {\n" +
"			  content: \"\";\n" +
"			  display: table;\n" +
"			  clear: both;\n" +
"			}\n" +
"		</style>\n" +
"		\n" +
"		\n" +
"    </head>\n" +
"    <body>\n" +
"	\n" +
"		<div class=\"header\">\n" +
"			<h2>Shopping list</h2>\n" +
"		</div>");
        
        
        
        System.out.println("		\n" +
"		<script>\n" +
"			// Create a \"close\" button and append it to each list item\n" +
"			var myNodelist = document.getElementsByTagName(\"LI\");\n" +
"			var i;\n" +
"			for (i = 0; i < myNodelist.length; i++) {\n" +
"			  var span = document.createElement(\"SPAN\");\n" +
"			  var txt = document.createTextNode(\"\\u00D7\");\n" +
"			  span.className = \"close\";\n" +
"			  span.appendChild(txt);\n" +
"			  myNodelist[i].appendChild(span);\n" +
"			}\n" +
"\n" +
"			// Click on a close button to hide the current list item\n" +
"			var close = document.getElementsByClassName(\"close\");\n" +
"			var i;\n" +
"			for (i = 0; i < close.length; i++) {\n" +
"			  close[i].onclick = function() {\n" +
"				var div = this.parentElement;\n" +
"				div.style.display = \"none\";\n" +
"			  }\n" +
"			}\n" +
"\n" +
"			// Add a \"checked\" symbol when clicking on a list item\n" +
"			var list = document.querySelector('ul');\n" +
"			list.addEventListener('click', function(ev) {\n" +
"			  if (ev.target.tagName === 'LI') {\n" +
"				ev.target.classList.toggle('checked');\n" +
"			  }\n" +
"			}, false);\n" +
"		</script>\n" +
"	</body>\n" +
"</html>");
    }
}
