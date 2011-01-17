/* Copyright 2011 the original author or authors.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.grails.formbuilder

/**
*
* @author <a href='mailto:limcheekin@vobject.com'>Lim Chee Kin</a>
*
* @since 0.1
*/
class Field {
	String name
	String type
	String settings
	Integer sequence
	FieldStatus status
	Date dateCreated
	Date lastUpdated
	
	static transients = ['status']
	
	static constraints = {
		name nullable:false
		type nullable:false
		settings nullable:false
		sequence nullable:false
		dateCreated blank:false
		lastUpdated nullable:true
	}
	
	static belongsTo = [form:Form]
}

enum FieldStatus {
	U, // UPDATED
	D // DELETED
}
