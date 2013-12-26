/*
 * Method calls which don't have conversion to sql are available only in select part of query
 * Unsupported: ToString(), ToByteArray()
 */
module CalculatedTestsGuid {
  root TestGuid {
    Guid originalGuid;
    
    // calculated String calculatedStringFromGuid from 'it => it.originalGuid.ToString()';
    
    // calculated Binary calculatedBinaryFromGuid from 'it => it.originalGuid.ToByteArray()';
  }  
}
