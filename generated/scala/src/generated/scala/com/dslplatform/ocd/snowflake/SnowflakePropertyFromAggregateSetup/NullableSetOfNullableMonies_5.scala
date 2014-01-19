package com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableMonies_5 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableMonies_5 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableMonies_5("+ URI +")"

   def copy(nullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]] = this._nullableSetOfNullableMonies): NullableSetOfNullableMonies_5 = {

  require(nullableSetOfNullableMonies ne null, "Null value was provided for property \"nullableSetOfNullableMonies\"")
  if(nullableSetOfNullableMonies.isDefined) require(nullableSetOfNullableMonies.get ne null, "Null value was provided for property \"nullableSetOfNullableMonies\"")
  com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableMonies)
    new NullableSetOfNullableMonies_5(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableMonies = nullableSetOfNullableMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableMonies_5): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableMonies = result._nullableSetOfNullableMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.snowflake.SnowflakePropertyFromAggregateSetup.NullableSetOfNullableMonies_5](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableMonies")
  def nullableSetOfNullableMonies = {
    _nullableSetOfNullableMonies
  }

  def nullableSetOfNullableMonies_= (value: Option[Set[Option[BigDecimal]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(value)
    _nullableSetOfNullableMonies = value

    _nullableSetOfNullableMonies = com.dslplatform.api.Guards.setCollectionOptionScale(_nullableSetOfNullableMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableMonies") nullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableMonies = nullableSetOfNullableMonies)

}

object NullableSetOfNullableMonies_5 extends AggregateRootCompanion[NullableSetOfNullableMonies_5]{

  def apply(
    nullableSetOfNullableMonies: Option[Set[Option[BigDecimal]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionRefNulls(nullableSetOfNullableMonies)
    require(nullableSetOfNullableMonies ne null, "Null value was provided for property \"nullableSetOfNullableMonies\"")
    if (nullableSetOfNullableMonies.isDefined) require(nullableSetOfNullableMonies.get ne null, "Null value was provided for property \"nullableSetOfNullableMonies\"")
    new NullableSetOfNullableMonies_5(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableMonies = nullableSetOfNullableMonies)
  }

}
