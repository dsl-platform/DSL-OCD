package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneMaps_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneMaps: Option[Set[Map[String, String]]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneMaps_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneMaps_2("+ URI +")"

   def copy(nullableSetOfOneMaps: Option[Set[Map[String, String]]] = this._nullableSetOfOneMaps): NullableSetOfOneMaps_2 = {

  require(nullableSetOfOneMaps ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
  if(nullableSetOfOneMaps.isDefined) require(nullableSetOfOneMaps.get ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneMaps)
    new NullableSetOfOneMaps_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneMaps = nullableSetOfOneMaps)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("ID")
  def ID = {
    _ID
  }

  private def ID_= (value: Int) {
    _ID = value

  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneMaps_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneMaps = result._nullableSetOfOneMaps
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneMaps_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableSetOfOneMaps")
  def nullableSetOfOneMaps = {
    _nullableSetOfOneMaps
  }

  def nullableSetOfOneMaps_= (value: Option[Set[Map[String, String]]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneMaps = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneMaps") nullableSetOfOneMaps: Option[Set[Map[String, String]]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneMaps = nullableSetOfOneMaps)

}

object NullableSetOfOneMaps_2 extends AggregateRootCompanion[NullableSetOfOneMaps_2]{

  def apply(
    nullableSetOfOneMaps: Option[Set[Map[String, String]]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneMaps)
    require(nullableSetOfOneMaps ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
    if (nullableSetOfOneMaps.isDefined) require(nullableSetOfOneMaps.get ne null, "Null value was provided for property \"nullableSetOfOneMaps\"")
    new NullableSetOfOneMaps_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneMaps = nullableSetOfOneMaps)
  }

}
