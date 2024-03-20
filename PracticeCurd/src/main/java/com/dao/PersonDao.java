package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Person;

public class PersonDao {
	
	private Connection conn;
	
	public PersonDao(Connection conn)
	{
		this.conn=conn;
	}
	
	
	//Add person data....
	public boolean addPerson(Person person)
	{
		boolean f=false;
		try {
			String sql="insert into person(pname,dob,email,qualification,bloodgroup,course,contactnumber) values(?,?,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, person.getName());
			ps.setString(2,person.getDob() );
			ps.setString(3,person.getEmail() );
			ps.setString(4,person.getQualification() );
			ps.setString(5,person.getBloodgroup() );
			ps.setString(6,person.getCourse() );
			ps.setString(7,person.getContactnumber());
			int i=ps.executeUpdate();
			
			if (i==1) {
				f=true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return f;
	}
	
	
	
	//Show All person data.........................
	public List<Person> getAllperson()
	{
		List<Person> list=new ArrayList<Person>();
		Person person=null;
		try {
			
			String sql="select * from person";
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				person=new Person();
				person.setId(rs.getInt(1));
				person.setName(rs.getString(2));
				person.setDob(rs.getString(3));
				person.setEmail(rs.getString(4));
				person.setQualification(rs.getString(5));
				person.setBloodgroup(rs.getString(6));
				person.setCourse(rs.getString(7));
				person.setContactnumber(rs.getString(8));
				list.add(person);
			}
			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
		
		
		
		return list;
	}

   
         

     //Get person by ID .....

        public Person getPersonById(int id)
        {
        	Person person=null;
        	try {
				String sql="select * from person where pid=?";
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, id);
        		ResultSet rs=ps.executeQuery();
        		while(rs.next())
        		{
        			person=new Person();
    				person.setId(rs.getInt(1));
    				person.setName(rs.getString(2));
    				person.setDob(rs.getString(3));
    				person.setEmail(rs.getString(4));
    				person.setQualification(rs.getString(5));
    				person.setBloodgroup(rs.getString(6));
    				person.setCourse(rs.getString(7));
    				person.setContactnumber(rs.getString(8));
        		}
        		
        		
        		
			} catch (Exception e) {
				e.printStackTrace();
			}
        	
        	return person;
        }


        
        //update By id....
        
        public  boolean updatePerson(Person person)
        {
        	boolean f=false;
        	
        	try {
        		
        		String sql="update person set pname=?,dob=?,email=?,qualification=?,bloodgroup=?,course=?,contactnumber=? where pid=?";
        		PreparedStatement ps=conn.prepareStatement(sql);
        		ps.setString(1, person.getName());
    			ps.setString(2,person.getDob() );
    			ps.setString(3,person.getEmail() );
    			ps.setString(4,person.getQualification() );
    			ps.setString(5,person.getBloodgroup() );
    			ps.setString(6,person.getCourse() );
    			ps.setString(7,person.getContactnumber());
    			ps.setInt(8,person.getId());
    			int i=ps.executeUpdate();
    			if (i==1) {
					f=true;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
        	
        	
        	return f;
        }

// Delete by id...
        public boolean  deletePerson(int id)
        {
        	boolean f=false;
        	try {
				String sql="delete  from person where pid=?";
				PreparedStatement ps=conn.prepareStatement(sql);
				ps.setInt(1, id);
				int i=ps.executeUpdate();
				if (i==1) {
					f=true;
				}
        		
        		
        		
        		
			} catch (Exception e) {
				e.printStackTrace();
			}
        	
        	
        	return f;
        }



}