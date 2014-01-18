package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableArrayOfOneStringsWithMaxLengthOf9_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableArrayOfOneStringsWithMaxLengthOf9_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableArrayOfOneStringsWithMaxLengthOf9_2("+ URI +")"

   def copy(nullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]] = this._nullableArrayOfOneStringsWithMaxLengthOf9): NullableArrayOfOneStringsWithMaxLengthOf9_2 = {

  require(nullableArrayOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableArrayOfOneStringsWithMaxLengthOf9\"")
  if(nullableArrayOfOneStringsWithMaxLengthOf9.isDefined) require(nullableArrayOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableArrayOfOneStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkArrayLength(nullableArrayOfOneStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneStringsWithMaxLengthOf9)
    new NullableArrayOfOneStringsWithMaxLengthOf9_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableArrayOfOneStringsWithMaxLengthOf9 = nullableArrayOfOneStringsWithMaxLengthOf9)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfOneStringsWithMaxLengthOf9_2): this.type = {
    this._URI = result._URI
    this._nullableArrayOfOneStringsWithMaxLengthOf9 = result._nullableArrayOfOneStringsWithMaxLengthOf9
    this._ID = result._ID
    this
  }

  def create()(implicit locator: ServiceLocator, ec: ExecutionContext, duration: Duration): this.type = {
    __locator = Some(Option(locator).getOrElse(Bootstrap.getLocator))
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).create(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def update()(implicit ec: ExecutionContext, duration: Duration): this.type = {
    val toUpdateWith = Await.result(__locator.get.resolve(classOf[CrudProxy]).update(this), duration)
    updateWithAnother(toUpdateWith)

  }

  def delete()(implicit ec: ExecutionContext, duration: Duration) = {
    if (__locator.isEmpty) throw new IllegalArgumentException("Can't delete aggregate before it's saved")
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableArrayOfOneStringsWithMaxLengthOf9_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneStringsWithMaxLengthOf9")
  def nullableArrayOfOneStringsWithMaxLengthOf9 = {
    _nullableArrayOfOneStringsWithMaxLengthOf9
  }

  def nullableArrayOfOneStringsWithMaxLengthOf9_= (value: Option[Array[String]]) {
    com.dslplatform.api.Guards.checkArrayLength(value, 9)
    com.dslplatform.api.Guards.checkArrayNulls(value)
    _nullableArrayOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableArrayOfOneStringsWithMaxLengthOf9") nullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableArrayOfOneStringsWithMaxLengthOf9 = nullableArrayOfOneStringsWithMaxLengthOf9)

}

object NullableArrayOfOneStringsWithMaxLengthOf9_2 extends AggregateRootCompanion[NullableArrayOfOneStringsWithMaxLengthOf9_2]{

  def apply(
    nullableArrayOfOneStringsWithMaxLengthOf9: Option[Array[String]] = None
  ) = {
    com.dslplatform.api.Guards.checkArrayLength(nullableArrayOfOneStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkArrayNulls(nullableArrayOfOneStringsWithMaxLengthOf9)
    require(nullableArrayOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableArrayOfOneStringsWithMaxLengthOf9\"")
    if (nullableArrayOfOneStringsWithMaxLengthOf9.isDefined) require(nullableArrayOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableArrayOfOneStringsWithMaxLengthOf9\"")
    new NullableArrayOfOneStringsWithMaxLengthOf9_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableArrayOfOneStringsWithMaxLengthOf9 = nullableArrayOfOneStringsWithMaxLengthOf9)
  }

}
