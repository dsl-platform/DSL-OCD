package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableSetOfOneTexts_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableSetOfOneTexts: Option[Set[String]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableSetOfOneTexts_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableSetOfOneTexts_2("+ URI +")"

   def copy(nullableSetOfOneTexts: Option[Set[String]] = this._nullableSetOfOneTexts): NullableSetOfOneTexts_2 = {

  require(nullableSetOfOneTexts ne null, "Null value was provided for property \"nullableSetOfOneTexts\"")
  if(nullableSetOfOneTexts.isDefined) require(nullableSetOfOneTexts.get ne null, "Null value was provided for property \"nullableSetOfOneTexts\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneTexts)
    new NullableSetOfOneTexts_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableSetOfOneTexts = nullableSetOfOneTexts)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneTexts_2): this.type = {
    this._URI = result._URI
    this._nullableSetOfOneTexts = result._nullableSetOfOneTexts
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableSetOfOneTexts_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneTexts")
  def nullableSetOfOneTexts = {
    _nullableSetOfOneTexts
  }

  def nullableSetOfOneTexts_= (value: Option[Set[String]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableSetOfOneTexts = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableSetOfOneTexts") nullableSetOfOneTexts: Option[Set[String]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableSetOfOneTexts = nullableSetOfOneTexts)

}

object NullableSetOfOneTexts_2 extends AggregateRootCompanion[NullableSetOfOneTexts_2]{

  def apply(
    nullableSetOfOneTexts: Option[Set[String]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableSetOfOneTexts)
    require(nullableSetOfOneTexts ne null, "Null value was provided for property \"nullableSetOfOneTexts\"")
    if (nullableSetOfOneTexts.isDefined) require(nullableSetOfOneTexts.get ne null, "Null value was provided for property \"nullableSetOfOneTexts\"")
    new NullableSetOfOneTexts_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableSetOfOneTexts = nullableSetOfOneTexts)
  }

}
