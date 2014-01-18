package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfNullableDoubles_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfNullableDoubles: Option[Set[Option[Double]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfNullableDoubles_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfNullableDoubles_2("+ URI +")"

   def copy(nullableSetOfNullableDoubles: Option[Set[Option[Double]]] = this._nullableSetOfNullableDoubles): NullableSetOfNullableDoubles_2 = {

  require(nullableSetOfNullableDoubles ne null, "Null value was provided for property \"nullableSetOfNullableDoubles\"")
  if(nullableSetOfNullableDoubles.isDefined) require(nullableSetOfNullableDoubles.get ne null, "Null value was provided for property \"nullableSetOfNullableDoubles\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableDoubles)
    new NullableSetOfNullableDoubles_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfNullableDoubles = nullableSetOfNullableDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfNullableDoubles_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfNullableDoubles = result._nullableSetOfNullableDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfNullableDoubles_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDoubles")
  def nullableSetOfNullableDoubles = {
    _nullableSetOfNullableDoubles
  }

  def nullableSetOfNullableDoubles_= (value: Option[Set[Option[Double]]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _nullableSetOfNullableDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfNullableDoubles") nullableSetOfNullableDoubles: Option[Set[Option[Double]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfNullableDoubles = nullableSetOfNullableDoubles)

}

object NullableSetOfNullableDoubles_2 extends AggregateRootCompanion[NullableSetOfNullableDoubles_2]{

  def apply(
    nullableSetOfNullableDoubles: Option[Set[Option[Double]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(nullableSetOfNullableDoubles)
    require(nullableSetOfNullableDoubles ne null, "Null value was provided for property \"nullableSetOfNullableDoubles\"")
    if (nullableSetOfNullableDoubles.isDefined) require(nullableSetOfNullableDoubles.get ne null, "Null value was provided for property \"nullableSetOfNullableDoubles\"")
    new NullableSetOfNullableDoubles_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfNullableDoubles = nullableSetOfNullableDoubles)
  }

}
