package test

import grails.converters.JSON

class ConviertejsonController {

    def index() {
    	
    		def persona=[
    			nombre:" autor",
    			edad:"20",
    			telefono:"1234567"
    			]
    		def domicilio=[
    			colonia:"arroyo",
    			id:"1",
    			nombre:"arroyo",
    			numero:"34-a",
    			calle:" arroyo"
    			]
    		def datos=[
    			agenda:"agenda 1",
    			datos:[persona,domicilio]]
    	//render datos as JSON

    	def json=datos as JSON
    	def fileName="ejemplo"
    	json.prettyPrint = true
		response.setHeader("Content-disposition","attachment;filename=${fileName}");
		response.setContentType("application/json");
		response.outputStream << json
     }
}
