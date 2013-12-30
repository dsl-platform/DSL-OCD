module CalculatedTestsCollections
{
  root TestCollections {
    List<Double> originalListDouble;
    Map originalMap;
    /*
     * COLLECTION OPERATIONS
     */
     // filter example: return elements from list bigger than 2
     calculated List<Double> filteredFromListDouble1 from 'it => it.originalListDouble.Where(elem => elem > 2).ToList<Double>()';

     // filter with transformation: filter elements smaller than 100, and then add index to every element of the list
     calculated List<Double> transformedFromListDouble1 from @"it =>
       it.originalListDouble
         .Where(e => e < 100)
         .Select(e => e*e).ToList<Double>()";

     // grouped ?? doesn't alow defining key and value types, default Map is resolved to Dictionary<String, String>
     // calculated Map groupedFromListDouble from 'it => it.originalListDouble.GroupBy(e => e % 2 == 0).ToDictionary(i => i.Key, i => i.ToList<Double>())';



    /*
     * MAP OPERATIONS
     */
     // filter value from map, can retrieve null or None
     calculated String? filteredStringFromDictionary from 'it => it.originalMap["iban"]';
     // convert map to List<List<String>> from key and value
     // calculated List<String> calculatedListValuesFromMap2 = 'it.originalMap.Select(e => new List<String> { e.Key, e.Value }).ToList()';
  }
}
