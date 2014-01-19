package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneStringsWithMaxLengthOf9_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneStringsWithMaxLengthOf9_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneStringsWithMaxLengthOf9_5("+ URI +")"

   def copy(nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]] = this._nullableSetOfOneStringsWithMaxLengthOf9): NullableSetOfOneStringsWithMaxLengthOf9_5 = {

  require(nullableSetOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableSetOfOneStringsWithMaxLengthOf9\"")
  if(nullableSetOfOneStringsWithMaxLengthOf9.isDefined) require(nullableSetOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableSetOfOneStringsWithMaxLengthOf9\"")
  com.dslplatform.api.Guards.checkCollectionLength(nullableSetOfOneStringsWithMaxLengthOf9, 9)
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneStringsWithMaxLengthOf9)
    new NullableSetOfOneStringsWithMaxLengthOf9_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneStringsWithMaxLengthOf9 = nullableSetOfOneStringsWithMaxLengthOf9)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneStringsWithMaxLengthOf9_5): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneStringsWithMaxLengthOf9 = result._nullableSetOfOneStringsWithMaxLengthOf9
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfOneStringsWithMaxLengthOf9_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneStringsWithMaxLengthOf9")
  def nullableSetOfOneStringsWithMaxLengthOf9 = {
    _nullableSetOfOneStringsWithMaxLengthOf9
  }

  def nullableSetOfOneStringsWithMaxLengthOf9_= (value: Option[Set[String]]) {
    com.dslplatform.api.Guards.checkCollectionLength(value, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneStringsWithMaxLengthOf9 = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneStringsWithMaxLengthOf9") nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneStringsWithMaxLengthOf9 = nullableSetOfOneStringsWithMaxLengthOf9)

}

object NullableSetOfOneStringsWithMaxLengthOf9_5 extends AggregateRootCompanion[NullableSetOfOneStringsWithMaxLengthOf9_5]{

  def apply(
    nullableSetOfOneStringsWithMaxLengthOf9: Option[Set[String]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionLength(nullableSetOfOneStringsWithMaxLengthOf9, 9)
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneStringsWithMaxLengthOf9)
    require(nullableSetOfOneStringsWithMaxLengthOf9 ne null, "Null value was provided for property \"nullableSetOfOneStringsWithMaxLengthOf9\"")
    if (nullableSetOfOneStringsWithMaxLengthOf9.isDefined) require(nullableSetOfOneStringsWithMaxLengthOf9.get ne null, "Null value was provided for property \"nullableSetOfOneStringsWithMaxLengthOf9\"")
    new NullableSetOfOneStringsWithMaxLengthOf9_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneStringsWithMaxLengthOf9 = nullableSetOfOneStringsWithMaxLengthOf9)
  }

}
