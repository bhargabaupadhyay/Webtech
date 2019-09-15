package hibernateAnno.maren.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	
		@Id
		
		@Column(name="emp_id")
		private int empId;	

		@Column(name="name")
		private String name;

		@Column(name="address")
		private String address;	  

		@Column(name="mobile")
		private String mobile;

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Employee [empId=").append(empId).append(", name=").append(name).append(", address=")
					.append(address).append(", mobile=").append(mobile).append("]");
			return builder.toString();
		}
		
}
