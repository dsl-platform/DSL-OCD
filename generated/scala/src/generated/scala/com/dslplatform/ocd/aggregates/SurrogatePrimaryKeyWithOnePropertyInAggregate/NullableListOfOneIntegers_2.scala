package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneIntegers_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneIntegers: Option[IndexedSeq[Int]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneIntegers_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneIntegers_2("+ URI +")"

   def copy(nullableListOfOneIntegers: Option[IndexedSeq[Int]] = this._nullableListOfOneIntegers): NullableListOfOneIntegers_2 = {

  require(nullableListOfOneIntegers ne null, "Null value was provided for property \"nullableListOfOneIntegers\"")
  if(nullableListOfOneIntegers.isDefined) require(nullableListOfOneIntegers.get ne null, "Null value was provided for property \"nullableListOfOneIntegers\"")
    new NullableListOfOneIntegers_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneIntegers = nullableListOfOneIntegers)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneIntegers_2): this.type = {
    this._URI = result._URI
    this._nullableListOfOneIntegers = result._nullableListOfOneIntegers
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneIntegers_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneIntegers")
  def nullableListOfOneIntegers = {
    _nullableListOfOneIntegers
  }

  def nullableListOfOneIntegers_= (value: Option[IndexedSeq[Int]]) {
    _nullableListOfOneIntegers = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneIntegers") nullableListOfOneIntegers: Option[IndexedSeq[Int]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneIntegers = nullableListOfOneIntegers)

}

object NullableListOfOneIntegers_2 extends AggregateRootCompanion[NullableListOfOneIntegers_2]{

  def apply(
    nullableListOfOneIntegers: Option[IndexedSeq[Int]] = None
  ) = {
    require(nullableListOfOneIntegers ne null, "Null value was provided for property \"nullableListOfOneIntegers\"")
    if (nullableListOfOneIntegers.isDefined) require(nullableListOfOneIntegers.get ne null, "Null value was provided for property \"nullableListOfOneIntegers\"")
    new NullableListOfOneIntegers_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneIntegers = nullableListOfOneIntegers)
  }

}
