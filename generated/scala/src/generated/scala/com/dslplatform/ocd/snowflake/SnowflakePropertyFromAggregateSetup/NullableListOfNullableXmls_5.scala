package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfNullableXmls_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfNullableXmls: Option[IndexedSeq[Option[scala.xml.Elem]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfNullableXmls_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfNullableXmls_5("+ URI +")"

   def copy(nullableListOfNullableXmls: Option[IndexedSeq[Option[scala.xml.Elem]]] = this._nullableListOfNullableXmls): NullableListOfNullableXmls_5 = {

  require(nullableListOfNullableXmls ne null, "Null value was provided for property \"nullableListOfNullableXmls\"")
  if(nullableListOfNullableXmls.isDefined) require(nullableListOfNullableXmls.get ne null, "Null value was provided for property \"nullableListOfNullableXmls\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableXmls)
    new NullableListOfNullableXmls_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfNullableXmls = nullableListOfNullableXmls)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableXmls_5): this.type = {
    this._URI = result._URI
    this._nullableListOfNullableXmls = result._nullableListOfNullableXmls
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableListOfNullableXmls_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableXmls")
  def nullableListOfNullableXmls = {
    _nullableListOfNullableXmls
  }

  def nullableListOfNullableXmls_= (value: Option[IndexedSeq[Option[scala.xml.Elem]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableListOfNullableXmls = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfNullableXmls") nullableListOfNullableXmls: Option[IndexedSeq[Option[scala.xml.Elem]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfNullableXmls = nullableListOfNullableXmls)

}

object NullableListOfNullableXmls_5 extends AggregateRootCompanion[NullableListOfNullableXmls_5]{

  def apply(
    nullableListOfNullableXmls: Option[IndexedSeq[Option[scala.xml.Elem]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableListOfNullableXmls)
    require(nullableListOfNullableXmls ne null, "Null value was provided for property \"nullableListOfNullableXmls\"")
    if (nullableListOfNullableXmls.isDefined) require(nullableListOfNullableXmls.get ne null, "Null value was provided for property \"nullableListOfNullableXmls\"")
    new NullableListOfNullableXmls_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfNullableXmls = nullableListOfNullableXmls)
  }

}
