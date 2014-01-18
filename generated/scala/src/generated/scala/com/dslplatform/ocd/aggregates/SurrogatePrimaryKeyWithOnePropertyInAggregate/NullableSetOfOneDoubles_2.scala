package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneDoubles_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneDoubles: Option[Set[Double]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonGetter("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneDoubles_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneDoubles_2("+ URI +")"

   def copy(nullableSetOfOneDoubles: Option[Set[Double]] = this._nullableSetOfOneDoubles): NullableSetOfOneDoubles_2 = {

  require(nullableSetOfOneDoubles ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
  if(nullableSetOfOneDoubles.isDefined) require(nullableSetOfOneDoubles.get ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
    new NullableSetOfOneDoubles_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneDoubles = nullableSetOfOneDoubles)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneDoubles_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneDoubles = result._nullableSetOfOneDoubles
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneDoubles_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonGetter("nullableSetOfOneDoubles")
  def nullableSetOfOneDoubles = {
    _nullableSetOfOneDoubles
  }

  def nullableSetOfOneDoubles_= (value: Option[Set[Double]]) {
    _nullableSetOfOneDoubles = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneDoubles") nullableSetOfOneDoubles: Option[Set[Double]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneDoubles = nullableSetOfOneDoubles)

}

object NullableSetOfOneDoubles_2 extends AggregateRootCompanion[NullableSetOfOneDoubles_2]{

  def apply(
    nullableSetOfOneDoubles: Option[Set[Double]] = None
  ) = {
    require(nullableSetOfOneDoubles ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
    if (nullableSetOfOneDoubles.isDefined) require(nullableSetOfOneDoubles.get ne null, "Null value was provided for property \"nullableSetOfOneDoubles\"")
    new NullableSetOfOneDoubles_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneDoubles = nullableSetOfOneDoubles)
  }

}
