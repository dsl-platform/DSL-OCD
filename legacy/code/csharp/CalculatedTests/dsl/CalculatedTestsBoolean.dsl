module CalculatedTestsBoolean {
  root TestBoolean {
    Boolean originalBoolean;

    // when true return "true", and other way around
    calculated String calculatedStringFromBoolean from 'it => it.originalBoolean ? "true" : "false"';

    /* for example purposes, Binary will always have 1 element, as boolean converts to a byte
     *
     * The expression 'new [] {Convert(IIF([-argument1-].originalBoolean, 1, 0))}'
     * (type: System.Linq.Expressions.NewArrayExpression) is not supported by this LINQ provider.
     **/
    //calculated Binary calculatedBinaryFromBoolean from 'it => new byte[] { (byte)(it.originalBoolean ? 0x01 : 0x00) }';
  }
}
