package com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup

import com.dslplatform.api.patterns._
import com.dslplatform.api.client._
import scala.concurrent.{Await, Future, ExecutionContext}
import scala.concurrent.duration.Duration

class OneListOfNullableLongs_2 @com.fasterxml.jackson.annotation.JsonIgnore() private(
    private var _URI: String,
    @transient private var __locator: Option[ServiceLocator],
    private var _oneListOfNullableLongs: IndexedSeq[Option[Long]]
  ) extends Serializable with AggregateRoot {

  @com.fasterxml.jackson.annotation.JsonProperty("URI")
  def URI = {

    _URI
  }

  override def hashCode = URI.hashCode
  override def equals(o: Any) = o match {
    case c: OneListOfNullableLongs_2 => c.URI == URI
    case _ => false
  }

  override def toString = "OneListOfNullableLongs_2("+ URI +")"

   def copy(oneListOfNullableLongs: IndexedSeq[Option[Long]] = this._oneListOfNullableLongs): OneListOfNullableLongs_2 = {

  require(oneListOfNullableLongs ne null, "Null value was provided for property \"oneListOfNullableLongs\"")
  com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableLongs)
    new OneListOfNullableLongs_2(_URI = this.URI, __locator = this.__locator, _oneListOfNullableLongs = oneListOfNullableLongs)
  }

  @com.fasterxml.jackson.annotation.JsonIgnore
  def isNewAggregate() = __locator == None

  private def updateWithAnother(result: com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableLongs_2): this.type = {
    this._URI = result._URI
    this._oneListOfNullableLongs = result._oneListOfNullableLongs
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
    Await.result(__locator.get.resolve(classOf[CrudProxy]).delete[com.dslplatform.ocd.aggregates.PrimaryKeyPropertyInAggregateSetup.OneListOfNullableLongs_2](URI), duration)
  }

  @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableLongs")
  @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY)
  def oneListOfNullableLongs = {
    _oneListOfNullableLongs
  }

  def oneListOfNullableLongs_= (value: IndexedSeq[Option[Long]]) {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(value)
    _oneListOfNullableLongs = value

  }

  @com.fasterxml.jackson.annotation.JsonCreator private def this(
    @com.fasterxml.jackson.annotation.JacksonInject("__locator") __locator: ServiceLocator
  , @com.fasterxml.jackson.annotation.JsonProperty("URI") URI: String
  , @com.fasterxml.jackson.annotation.JsonProperty("oneListOfNullableLongs") oneListOfNullableLongs: IndexedSeq[Option[Long]]
  ) =
    this(__locator = Some(__locator), _URI = URI, _oneListOfNullableLongs = if (oneListOfNullableLongs == null) IndexedSeq.empty else oneListOfNullableLongs)

}

object OneListOfNullableLongs_2 extends AggregateRootCompanion[OneListOfNullableLongs_2]{

  def apply(
    oneListOfNullableLongs: IndexedSeq[Option[Long]] = IndexedSeq.empty
  ) = {
    com.dslplatform.api.Guards.checkCollectionOptionValNulls(oneListOfNullableLongs)
    require(oneListOfNullableLongs ne null, "Null value was provided for property \"oneListOfNullableLongs\"")
    new OneListOfNullableLongs_2(
      __locator = None
    , _URI = java.util.UUID.randomUUID.toString
    , _oneListOfNullableLongs = oneListOfNullableLongs)
  }

}
