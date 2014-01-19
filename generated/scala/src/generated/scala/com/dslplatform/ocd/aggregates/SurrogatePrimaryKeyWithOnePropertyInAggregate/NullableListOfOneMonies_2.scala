package com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class NullableListOfOneMonies_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _ID: Int,
    private var _nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: NullableListOfOneMonies_2 => c.URI == URI
    case _ => false
  }

  override def toString = "NullableListOfOneMonies_2("+ URI +")"

   def copy(nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]] = this._nullableListOfOneMonies): NullableListOfOneMonies_2 = {

  require(nullableListOfOneMonies ne null, "Null value was provided for property \"nullableListOfOneMonies\"")
  if(nullableListOfOneMonies.isDefined) require(nullableListOfOneMonies.get ne null, "Null value was provided for property \"nullableListOfOneMonies\"")
  com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMonies)
    new NullableListOfOneMonies_2(_URI = this.URI, __locator = this.__locator, _ID = _ID, _nullableListOfOneMonies = nullableListOfOneMonies)
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

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneMonies_2): this.type = {
    this._URI = result._URI
    this._nullableListOfOneMonies = result._nullableListOfOneMonies
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.SurrogatePrimaryKeyWithOnePropertyInAggregate.NullableListOfOneMonies_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMonies")
  def nullableListOfOneMonies = {
    _nullableListOfOneMonies
  }

  def nullableListOfOneMonies_= (value: Option[IndexedSeq[BigDecimal]]) {
    com.dslplatform.api.Guards.checkCollectionNulls(value)
    _nullableListOfOneMonies = value

    _nullableListOfOneMonies = com.dslplatform.api.Guards.setCollectionScale(_nullableListOfOneMonies, 2)
  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("ID") ID: Int
  , @com.fasterxml.jackson.annotation.JsonProperty("nullableListOfOneMonies") nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _ID = ID, _nullableListOfOneMonies = nullableListOfOneMonies)

}

object NullableListOfOneMonies_2 extends AggregateRootCompanion[NullableListOfOneMonies_2]{

  def apply(
    nullableListOfOneMonies: Option[IndexedSeq[BigDecimal]] = None
  ) = {
    com.dslplatform.api.Guards.checkCollectionNulls(nullableListOfOneMonies)
    require(nullableListOfOneMonies ne null, "Null value was provided for property \"nullableListOfOneMonies\"")
    if (nullableListOfOneMonies.isDefined) require(nullableListOfOneMonies.get ne null, "Null value was provided for property \"nullableListOfOneMonies\"")
    new NullableListOfOneMonies_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _ID = 0
    , _nullableListOfOneMonies = nullableListOfOneMonies)
  }

}